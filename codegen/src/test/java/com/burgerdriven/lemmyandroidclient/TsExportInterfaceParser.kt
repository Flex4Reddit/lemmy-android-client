package com.burgerdriven.lemmyandroidclient

import android.os.Parcelable
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

class TsExportInterfaceParser {
  /**
   * Regex that captures the properties of a TS interface.
   * https://regex101.com/r/d07ajj/latest
   */
  val tsIfaceExpr = Regex("""export interface (\w+) \{([\s\S]+?)}""")
  
  /**
   * Regex that captures prop name and its type.
   * https://regex101.com/r/lCpnK2/latest
   */
  val tsIfacePropsExpr = Regex("""\s*(\w+)(\?)?:\s*([^;]+);""")
  
  val models = mutableMapOf<String, TypeSpec>()
  
  fun parse(file: FileSpec.Builder, tsCode: String) {
    val tsIface = tsIfaceExpr.find(tsCode) ?: throw Error("couldn't parse iface: $tsCode")
    
    val (name, propsStr) = tsIface.destructured
    val props = tsIfacePropsExpr.findAll(propsStr).toList()
    assert(props.isNotEmpty()) { "couldn't parse iface props: $tsCode" }
    
    val modelSpec = TypeSpec.classBuilder(name)
    val constructorSpec = FunSpec.constructorBuilder()
    
    props.forEach {
      val (propName, isNullable, propType) = it.destructured
      val propTsType = parseTsType(propType).copy(nullable = isNullable == "?")
      
      val paramSpec = if (propName.contains('_')) { // snake_case? Prettify to camel case
        val camelPropName = propName.snakeToCamel()
        val renameAnnotationSpec = AnnotationSpec.builder(Json::class.asTypeName())
            .addMember("name = %S", propName)
            .build()
        ParameterSpec.builder(camelPropName, propTsType)
            .addAnnotation(renameAnnotationSpec)
      } else {
        ParameterSpec.builder(propName, propTsType)
      }
      
      hotfixes[PoetFinder(name, propName)]?.let { // Has hotfix? Add annotation
        paramSpec.addAnnotation(it)
      }
      
      // https://stackoverflow.com/a/44484112
      // Constructor & property name must match for pretty constructor
      val param = paramSpec.build()
      constructorSpec.addParameter(param)
      PropertySpec.builder(param.name, propTsType)
          .initializer(param.name)
          .let { modelSpec.addProperty(it.build()) }
    }
    
    modelSpec
        .addModifiers(KModifier.DATA)
        .primaryConstructor(constructorSpec.build())
        .addSuperinterface(Parcelable::class.asTypeName())
        .addAnnotation(Parcelize::class.asTypeName())
        .addAnnotation(
            AnnotationSpec.builder(JsonClass::class.asTypeName())
                .addMember("generateAdapter = true")
                .build()
        )
        .build()
        .also { models[name] = it }
        .also { file.addType(it) }
  }
  
  private val hotfixes = mapOf(
      PoetFinder("LocalUser", "default_listing_type") to
          ClassName(hotfixPkgName, "FixListingType"),
      PoetFinder("LocalUser", "default_sort_type") to
          ClassName(hotfixPkgName, "FixSortType"),
  )
}

data class PoetFinder(
    val name: String,
    val prop: String,
)
