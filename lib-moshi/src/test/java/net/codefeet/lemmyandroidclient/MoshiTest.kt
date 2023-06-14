package net.codefeet.lemmyandroidclient

import com.squareup.moshi.Moshi
import kotlinx.coroutines.test.runTest
import net.codefeet.lemmyandroidclient.gen.http.LemmyApi
import net.codefeet.lemmyandroidclient.gen.http.LemmyResponseApi
import net.codefeet.lemmyandroidclient.gen.types.AddAdmin
import net.codefeet.lemmyandroidclient.gen.types.ListingType
import net.codefeet.lemmyandroidclient.gen.types.LocalSite
import net.codefeet.lemmyandroidclient.gen.types.LocalUser
import net.codefeet.lemmyandroidclient.gen.types.RegistrationMode
import net.codefeet.lemmyandroidclient.gen.types.SortType
import org.junit.Assert.assertEquals
import org.junit.Test
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class MoshiTest {
  
  val moshiMaker = Moshi.Builder()
      .addLemmyHotfixAdapters()
      .build()
  
  val retrofitMaker = Retrofit.Builder()
      .baseUrl("https://lemmy.world/")
      .addConverterFactory(MoshiConverterFactory.create(moshiMaker))
      .build()
  
  @Test
  fun json() {
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
    assertEquals(SortType.Active, ans.defaultSortType)
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
