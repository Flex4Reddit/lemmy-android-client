package com.burgerdriven.lemmyandroidclient

import com.squareup.kotlinpoet.FileSpec
import io.klogging.NoCoLogging
import io.klogging.config.DEFAULT_CONSOLE
import io.klogging.config.loggingConfiguration
import org.junit.Test
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.name
import kotlin.io.path.readText

class Codegen : NoCoLogging {
  val tsIfaceParser = TsExportInterfaceParser()
  val tsTypeParser = TsExportTypeParser()
  val tsHttpParser = TsHttpParser()
  
  val projRoot = Paths.get("").toAbsolutePath().parent
  val libKtMoshiRoot = projRoot.resolve("lib-moshi/src/main/java")
  val lemmyJsRoot = projRoot.parent.resolve("lemmy-js-client")
  val lemmyJsTypes = lemmyJsRoot.resolve("src/types")
  val lemmyJsHttp = lemmyJsRoot.resolve("src/http.ts")
  val ignoreFiles = setOf(
      "others.ts", // Seems to be hand-written
      "PostOrCommentId.ts", // Dunno how to deal with struct unions
  )
  
  /**
   * Regex that captures the type of export.
   * https://regex101.com/r/DVkY72/latest
   */
  val exportExpr = Regex("""export (\w+) (\w+)""")
  
  @Test
  fun main() {
    loggingConfiguration { DEFAULT_CONSOLE() }
    
    println("pwd: $projRoot")
    println("lemmy-js-root: $lemmyJsRoot")
    println("lemmy-js-root types: $lemmyJsTypes")
    println("lemmy-js-root http: $lemmyJsHttp")
    cleanDir(libKtMoshiRoot)
    
    Files.list(lemmyJsTypes).forEach(::generateModels)
    generateApi(lemmyJsHttp)
    
    stats.forEach { (k, v) -> println("converted ${v.size} $k") }
  }
  
  private fun generateModels(path: Path) {
    if (ignoreFiles.contains(path.name)) return // Blacklisted file? No-op
    
    logger.debug { "p: $path ${path.name} ${path.fileName}" }
    val fileSpec = FileSpec.builder(typesPkgName, path.name.substringBefore('.'))
    val tsCode = path.readText()
    
    exportExpr.findAll(tsCode).forEach {
      val (export, name) = it.destructured
      addStat(export, name)
      logger.debug { "  t: $export $name" }
      
      when (val it = export) {
        "type" -> tsTypeParser.parse(fileSpec, tsCode)
        "interface" -> tsIfaceParser.parse(fileSpec, tsCode)
        "const" -> Unit // a single versioning variable for now
        "enum" -> Unit // a single enum used for websocket api for now
        else -> throw Error("unexpected export: $it")
      }
    }
    
    fileSpec.build().writeTo(libKtMoshiRoot)
  }
  
  private fun generateApi(path: Path) {
    tsHttpParser.parse(libKtMoshiRoot, tsIfaceParser.models, path.readText())
  }
}
