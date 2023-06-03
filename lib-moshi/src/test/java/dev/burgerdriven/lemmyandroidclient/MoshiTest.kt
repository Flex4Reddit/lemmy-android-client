package dev.burgerdriven.lemmyandroidclient

import com.squareup.moshi.Moshi
import dev.burgerdriven.lemmyandroidclient.types.AddAdmin
import org.junit.Assert.assertEquals
import org.junit.Test

class MoshiTest {
  
  @Test
  fun `moshi json`() {
    val inModel = AddAdmin(1, true, "jwt")
    val moshi = Moshi.Builder().build().adapter(inModel.javaClass)
    val json = moshi.toJson(inModel)
    val outModel = moshi.fromJson(json)
    
    assertEquals(inModel, outModel)
  }
}
