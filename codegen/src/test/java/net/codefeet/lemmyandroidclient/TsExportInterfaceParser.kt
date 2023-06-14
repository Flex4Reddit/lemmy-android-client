package net.codefeet.lemmyandroidclient

import android.os.Parcelable
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asTypeName
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
  private val tsIfaces = mutableMapOf<String, List<MatchResult>>()
  
  fun parse(tsCode: String) {
    val tsIface = tsIfaceExpr.find(tsCode) ?: throw Error("couldn't parse iface: $tsCode")
    
    val (name, propsStr) = tsIface.destructured
    val props = tsIfacePropsExpr.findAll(propsStr).toList()
    assert(props.isNotEmpty()) { "couldn't parse iface props: $tsCode" }
    tsIfaces[name] = props
  }
  
  fun genTypes(plugin: CodegenPlugin) {
    tsIfaces.forEach { (name, props) ->
      val model = genModelSpec(plugin, name, props)
      models[name] = model
      
      newTypesFileSpec(typesPkg, name)
          .addType(model)
          .build()
          .writeTo(plugin.modulePath)
    }
  }
  
  private fun genModelSpec(plugin: CodegenPlugin, name: String, props: List<MatchResult>): TypeSpec {
    val modelSpec = TypeSpec.classBuilder(name)
    val constructorSpec = FunSpec.constructorBuilder()
    
    props.forEach {
      val (propName, isNullable, propType) = it.destructured
      val propTsType = parseTsType(propType).copy(nullable = isNullable == "?")
      
      val paramSpec = if (propName.contains('_')) { // snake_case? Prettify to camel case
        ParameterSpec.builder(propName.snakeToCamel(), propTsType)
            .addAnnotation(plugin.newRenameAnnotation(propName))
      } else {
        ParameterSpec.builder(propName, propTsType)
      }
      
      plugin.decorateModelField(paramSpec, PoetContext(name, propName))
      
      // https://stackoverflow.com/a/44484112
      // Constructor & property name must match for pretty constructor
      val param = paramSpec.build()
      constructorSpec.addParameter(param)
      PropertySpec.builder(param.name, propTsType)
          .initializer(param.name)
          .let { modelSpec.addProperty(it.build()) }
    }
    
    return modelSpec
        .addModifiers(KModifier.DATA)
        .primaryConstructor(constructorSpec.build())
        .addSuperinterface(Parcelable::class.asTypeName())
        .addAnnotation(Parcelize::class.asTypeName())
        .also { plugin.decorateModelClass(it) }
        .build()
  }
}
