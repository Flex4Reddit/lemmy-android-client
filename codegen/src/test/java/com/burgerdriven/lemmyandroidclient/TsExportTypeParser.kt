package com.burgerdriven.lemmyandroidclient

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.TypeSpec

class TsExportTypeParser {
  // https://regex101.com/r/9hY3zo/latest
  val tsTypeExpr = Regex("""export type (\w+) =\s*((?:\S+)?(?:\s*\|\s*\S+)*);""")
  
  // https://regex101.com/r/mVWCBS/latest
  val tsTypeValueExpr = Regex(""""?(\w+)"?""")
  
  fun parse(file: FileSpec.Builder, tsCode: String) {
    val tsType = tsTypeExpr.find(tsCode) ?: throw Error("couldn't parse type: $tsCode")
    
    val (name, valueStr) = tsType.destructured
    val values = tsTypeValueExpr.findAll(valueStr).toList()
    assert(values.isNotEmpty()) { "couldn't parse type values: $tsCode" }
    
    if (values.size > 1) { // More than 1 value? enum
      val enum = TypeSpec.enumBuilder(name)
      values.forEach {
        val rawValue = it.value
        // Only handle strings for now
        assert(rawValue.startsWith('"') && rawValue.endsWith('"')) { "unexpected enum: $it" }
        enum.addEnumConstant(it.groupValues[1])
      }
      file.addType(enum.build())
      return
    }
    
    values[0].value.toKtClassName() // 1 value? Type alias
        .let { TypeAliasSpec.builder(name, it).build() }
        .let { file.addTypeAlias(it) }
  }
}
