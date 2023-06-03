package com.burgerdriven.lemmyandroidclient

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.asClassName
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import kotlin.io.path.absolutePathString

val pkgName = "dev.burgerdriven.lemmyandroidclient"
val typesPkgName = "$pkgName.types"
val regexOpt = setOf(RegexOption.MULTILINE, RegexOption.DOT_MATCHES_ALL)
val stats = mutableMapOf<String, MutableList<String>>()

fun parseTsType(typeString: String): TypeName {
  var remaining = typeString.trim()
  var genericsStartIndex = remaining.indexOf('<')
  if (genericsStartIndex == -1) {
    // No generics, return the type name
    return remaining.toKtClassName()
  }
  
  val typeName = remaining.substring(0, genericsStartIndex).trim()
  remaining = remaining.substring(genericsStartIndex + 1, remaining.length - 1)
  
  val generics = mutableListOf<TypeName>()
  var depth = 0
  var startIndex = 0
  
  for (i in 0 until remaining.length) {
    val char = remaining[i]
    if (char == '<') {
      depth++
    } else if (char == '>') {
      depth--
    } else if (char == ',' && depth == 0) {
      val genericString = remaining.substring(startIndex, i).trim()
      generics.add(parseTsType(genericString))
      startIndex = i + 1
    }
  }
  
  val lastGenericString = remaining.substring(startIndex).trim()
  generics.add(parseTsType(lastGenericString))
  
  return typeName.toKtClassName().parameterizedBy(generics)
}

fun String.toKtClassName(): ClassName {
  return when (this) {
    "number" -> Long::class.asClassName()
    "boolean" -> Boolean::class.asClassName()
    "string" -> String::class.asClassName()
    "Array" -> List::class.asClassName()
    "Map" -> Map::class.asClassName()
    "null" -> Nothing::class.asClassName()
    else -> ClassName(typesPkgName, this)
  }
}

fun String.snakeToCamel(): String {
  val builder = StringBuilder()
  var capitalizeNext = false
  
  for (char in this) {
    if (char == '_') {
      capitalizeNext = true
    } else {
      builder.append(if (capitalizeNext) char.uppercaseChar() else char)
      capitalizeNext = false
    }
  }
  
  return builder.toString()
}

fun cleanDir(path: Path) {
  Files.walk(path).use { walk ->
    walk.sorted(Comparator.reverseOrder())
        .filter { it.absolutePathString() != path.absolutePathString() }
        .map { obj: Path -> obj.toFile() }
        // .peek { x: File? -> println(x) }
        .forEach { obj: File -> obj.delete() }
  }
}

fun addStat(key: String, name: String) {
  stats[key] = (stats[key] ?: mutableListOf()).apply { add(name) }
}
