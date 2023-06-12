package dev.burgerdriven.lemmyandroidclient

import com.google.gson.GsonBuilder
import dev.burgerdriven.lemmyandroidclient.gen.http.LemmyApi
import dev.burgerdriven.lemmyandroidclient.gen.http.LemmyResponseApi
import dev.burgerdriven.lemmyandroidclient.gen.types.AddAdmin
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import dev.burgerdriven.lemmyandroidclient.gen.types.LocalSite
import dev.burgerdriven.lemmyandroidclient.gen.types.LocalUser
import dev.burgerdriven.lemmyandroidclient.gen.types.RegistrationMode
import dev.burgerdriven.lemmyandroidclient.gen.types.SortType
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class GsonTest {
  val gson = GsonBuilder()
      .addLemmyHotfixAdapters()
      .create()
  
  val retrofitMaker = Retrofit.Builder()
      .baseUrl("https://lemmy.world/")
      .addConverterFactory(GsonConverterFactory.create(gson))
      .build()
  
  @Test
  fun json() {
    val inModel = AddAdmin(1, true, "jwt")
    val json = gson.toJson(inModel)
    val outModel = gson.fromJson(json, AddAdmin::class.java)
    
    assertEquals(inModel, outModel)
  }
  
  @Test
  fun `all lowercase hotfix for RegistrationMode`() {
    val ans = gson.fromJson(Fixtures.LocalSite, LocalSite::class.java)!!
    
    assertEquals(RegistrationMode.RequireApplication, ans.registrationMode)
    assertEquals(ListingType.Local, ans.defaultPostListingType)
  }
  
  @Test
  fun `int values hotfix for ListingType & SortType`() {
    val ans = gson.fromJson(Fixtures.LocalUser, LocalUser::class.java)!!
    
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
