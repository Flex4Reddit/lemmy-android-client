package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetSiteResponse(
  @SerializedName("site_view")
  public val siteView: SiteView,
  public val admins: List<PersonView>,
  public val online: Long,
  public val version: String,
  @SerializedName("my_user")
  public val myUser: MyUserInfo?,
  @SerializedName("all_languages")
  public val allLanguages: List<Language>,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>,
  public val taglines: List<Tagline>?,
  @SerializedName("custom_emojis")
  public val customEmojis: List<CustomEmojiView>?,
) : Parcelable
