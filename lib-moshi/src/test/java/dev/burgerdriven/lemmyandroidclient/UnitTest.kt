package dev.burgerdriven.lemmyandroidclient

import com.squareup.moshi.Moshi
import dev.burgerdriven.lemmyandroidclient.types.AddAdmin
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class UnitTest {
  
  val retrofit = Retrofit.Builder()
      .baseUrl("https://lemmy.ml/api/v3/")
      .addConverterFactory(MoshiConverterFactory.create())
      .build()
  
  @Test
  fun moshi() {
    val inModel = AddAdmin(1, true, "jwt")
    val moshi = Moshi.Builder().build().adapter(inModel.javaClass)
    val json = moshi.toJson(inModel)
    val outModel = moshi.fromJson(json)
    
    assertEquals(inModel, outModel)
  }
  
  @Test
  fun `retrofit api`() = runTest {
    val api = retrofit.create<LemmyApi>()
    val err = runCatching { api.getSite("always fail") }
        .exceptionOrNull() as HttpException
    assertEquals(400, err.code())
  }
  
  @Test
  fun `retrofit response api`() = runTest {
    val api = retrofit.create<LemmyResponseApi>()
    assertEquals(400, api.getSite("always fail").code())
  }
}
