package net.codefeet.lemmyandroidclient

import com.google.gson.GsonBuilder
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
