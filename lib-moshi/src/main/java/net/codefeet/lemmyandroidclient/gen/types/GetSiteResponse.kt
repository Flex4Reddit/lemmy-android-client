package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetSiteResponse(
  @Json(name = "site_view")
  public val siteView: SiteView,
  public val admins: List<PersonView>,
  public val online: Long,
  public val version: String,
  @Json(name = "my_user")
  public val myUser: MyUserInfo?,
  @Json(name = "all_languages")
  public val allLanguages: List<Language>,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>,
  public val taglines: List<Tagline>?,
  @Json(name = "custom_emojis")
  public val customEmojis: List<CustomEmojiView>?,
) : Parcelable
