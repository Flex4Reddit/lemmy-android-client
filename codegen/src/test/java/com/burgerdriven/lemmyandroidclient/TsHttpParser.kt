package com.burgerdriven.lemmyandroidclient

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.asTypeName
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.OPTIONS
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

enum class ApiReturnFormat {
  DirectFmt,
  ResponseFmt;
}

class TsHttpParser {
  /**
   * Regex that captures lemmy api functions in http.ts
   * https://regex101.com/r/TkEpF9/latest
   */
  private val lemmyApiExpr = Regex(
      """(\w+)\((?:\R|form)[^)]*\)\s*\{.*?wrapper<.*?(\w+),.*?(\w+).*?>.*?HttpType\.(\w+).*?"/(\S+)".*?}""",
      setOf(RegexOption.MULTILINE, RegexOption.DOT_MATCHES_ALL))
  
  private lateinit var tsApis: List<MatchResult>
  
  fun parse(tsCode: String) {
    tsApis = lemmyApiExpr.findAll(tsCode).toList()
    assert(tsApis.isNotEmpty()) { "couldn't parse lemmy api: $tsCode" }
  }
  
  fun genApis(plugin: CodegenPlugin, models: Map<String, TypeSpec>) {
    mapOf(
        "LemmyApi" to ApiReturnFormat.DirectFmt,
        "LemmyResponseApi" to ApiReturnFormat.ResponseFmt
    ).forEach { (fileName, returnFmt) ->
      val apiSpec = TypeSpec.interfaceBuilder(fileName)
      
      tsApis.forEach {
        val api = genApi(models, it, returnFmt)
        apiSpec.addFunction(api)
      }
      
      newTypesFileSpec(httpPkg, fileName)
          .addType(apiSpec.build())
          .build()
          .writeTo(plugin.modulePath)
    }
  }
  
  private fun genApi(
      models: Map<String, TypeSpec>,
      api: MatchResult,
      returnFmt: ApiReturnFormat,
  ): FunSpec {
    val (name, reqType, resType, httpMethod, path) = api.destructured
    addStat("http api", name)
    
    val apiSpec = FunSpec.builder(name)
        .addModifiers(KModifier.SUSPEND, KModifier.ABSTRACT)
        .addAnnotation(
            AnnotationSpec.builder(parseHttpMethod(httpMethod))
                .addMember("\"api/v3/$path\"")
                .build()
        )
    
    // Generate function params
    val paramSpecs = if (httpMethod == "Get") { // Http GET? Generate query params
      val reqTypeSpec = models[reqType]
          ?: throw Error("request type spec missing: $reqType")
      
      reqTypeSpec.propertySpecs.map { propSpec ->
        ParameterSpec.builder(propSpec.name, propSpec.type)
            .addAnnotation(
                AnnotationSpec.builder(Query::class.asTypeName())
                    .addMember("\"${propSpec.name.camelToSnake()}\"")
                    .build()
            )
      }
    } else { // Others? Send params as body
      ParameterSpec.builder("form", parseTsType(reqType))
          .addAnnotation(Body::class.asTypeName())
          .let(::listOf)
    }
    apiSpec.addParameters(paramSpecs.map { it.build() })
    
    // Generate return type
    val returnSpec = when (returnFmt) {
      ApiReturnFormat.DirectFmt -> parseTsType(resType)
      ApiReturnFormat.ResponseFmt -> Response::class.asClassName()
          .parameterizedBy(parseTsType(resType))
    }
    apiSpec.returns(returnSpec)
    
    return apiSpec.build()
  }
  
  private fun parseHttpMethod(method: String): ClassName {
    return when (method) {
      "Get" -> GET::class
      "Head" -> HEAD::class
      "Post" -> POST::class
      "Put" -> PUT::class
      "Patch" -> PATCH::class
      "Options" -> OPTIONS::class
      "Delete" -> DELETE::class
      else -> throw Error("unexpected http method: $method")
    }.asClassName()
  }
}


