package dev.burgerdriven.lemmyandroidclient

import com.squareup.moshi.Moshi
import dev.burgerdriven.lemmyandroidclient.gen.http.LemmyApi
import dev.burgerdriven.lemmyandroidclient.gen.http.LemmyResponseApi
import dev.burgerdriven.lemmyandroidclient.gen.types.AddAdmin
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import dev.burgerdriven.lemmyandroidclient.gen.types.LocalSite
import dev.burgerdriven.lemmyandroidclient.gen.types.LocalUser
import dev.burgerdriven.lemmyandroidclient.gen.types.RegistrationMode
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class UnitTest {
  
  val moshiMaker = Moshi.Builder()
      .addLemmyHotfixAdapters()
      .build()
  
  val retrofitMaker = Retrofit.Builder()
      .baseUrl("https://lemmy.ml/api/v3/")
      .addConverterFactory(MoshiConverterFactory.create(moshiMaker))
      .build()
  
  @Test
  fun moshi() {
    val inModel = AddAdmin(1, true, "jwt")
    val moshi = moshiMaker.adapter(inModel.javaClass)
    val json = moshi.toJson(inModel)
    val outModel = moshi.fromJson(json)
    
    assertEquals(inModel, outModel)
  }
  
  @Test
  fun `all lowercase hotfix for RegistrationMode`() {
    val ans = moshiMaker.adapter(LocalSite::class.java).fromJson(Fixtures.LocalSite)!!
    
    assertEquals(RegistrationMode.RequireApplication, ans.registrationMode)
    assertEquals(ListingType.Local, ans.defaultPostListingType)
  }
  
  @Test
  fun `int values hotfix for ListingType & SortType`() {
    val ans = moshiMaker.adapter(LocalUser::class.java).fromJson(Fixtures.LocalUser)!!
    
    assertEquals(ListingType.Local, ans.defaultListingType)
  }
  
  @Test
  fun `retrofit api`() = runTest {
    val api = retrofitMaker.create<LemmyApi>()
    val err = runCatching { api.getSite("always fail") }
        .exceptionOrNull() as HttpException
    assertEquals(400, err.code())
  }
  
  @Test
  fun `retrofit response api`() = runTest {
    val api = retrofitMaker.create<LemmyResponseApi>()
    assertEquals(400, api.getSite("always fail").code())
  }
}
