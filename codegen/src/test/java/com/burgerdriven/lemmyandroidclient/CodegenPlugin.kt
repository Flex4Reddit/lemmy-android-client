package com.burgerdriven.lemmyandroidclient

import com.google.gson.annotations.SerializedName
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.nio.file.Path

interface CodegenPlugin {
  /**
   * Root path of the module.
   */
  val modulePath: Path
  
  /**
   * Create a rename annotation for a field.
   */
  fun newRenameAnnotation(propName: String): AnnotationSpec
  
  /**
   * Allow customization of the model's class declaration.
   */
  fun decorateModelClass(spec: TypeSpec.Builder)
  
  /**
   * Allow customization of the model's field declaration.
   */
  fun decorateModelField(spec: ParameterSpec.Builder, ctx: PoetContext)
}

object MoshiPlugin : CodegenPlugin {
  override val modulePath: Path = projRoot.resolve("lib-moshi/src/main/java")
  
  override fun newRenameAnnotation(propName: String) =
      AnnotationSpec.builder(Json::class.asTypeName())
          .addMember("name = %S", propName)
          .build()
  
  override fun decorateModelClass(spec: TypeSpec.Builder) {
    AnnotationSpec.builder(JsonClass::class.asTypeName())
        .addMember("generateAdapter = true")
        .build()
        .let { spec.addAnnotation(it) }
  }
  
  private val hotfixes = mapOf(
      PoetContext("LocalUser", "default_listing_type") to
          ClassName(hotfixPkgName, "FixListingType"),
      PoetContext("LocalUser", "default_sort_type") to
          ClassName(hotfixPkgName, "FixSortType"),
  )
  
  override fun decorateModelField(spec: ParameterSpec.Builder, ctx: PoetContext) {
    hotfixes[ctx]?.let { spec.addAnnotation(it) }
  }
}

object GsonPlugin : CodegenPlugin {
  override val modulePath: Path = projRoot.resolve("lib-gson/src/main/java")
  
  override fun newRenameAnnotation(propName: String) =
      AnnotationSpec.builder(SerializedName::class.asTypeName())
          .addMember("%S", propName)
          .build()
  
  override fun decorateModelClass(spec: TypeSpec.Builder) = Unit
  
  override fun decorateModelField(spec: ParameterSpec.Builder, ctx: PoetContext) = Unit
}


