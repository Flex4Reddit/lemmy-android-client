package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class SaveUserSettings(
  @Json(name = "show_nsfw")
  public val showNsfw: Boolean?,
  @Json(name = "show_scores")
  public val showScores: Boolean?,
  public val theme: String?,
  @Json(name = "default_sort_type")
  public val defaultSortType: SortType?,
  @Json(name = "default_listing_type")
  public val defaultListingType: ListingType?,
  @Json(name = "interface_language")
  public val interfaceLanguage: String?,
  public val avatar: String?,
  public val banner: String?,
  @Json(name = "display_name")
  public val displayName: String?,
  public val email: String?,
  public val bio: String?,
  @Json(name = "matrix_user_id")
  public val matrixUserId: String?,
  @Json(name = "show_avatars")
  public val showAvatars: Boolean?,
  @Json(name = "send_notifications_to_email")
  public val sendNotificationsToEmail: Boolean?,
  @Json(name = "bot_account")
  public val botAccount: Boolean?,
  @Json(name = "show_bot_accounts")
  public val showBotAccounts: Boolean?,
  @Json(name = "show_read_posts")
  public val showReadPosts: Boolean?,
  @Json(name = "show_new_post_notifs")
  public val showNewPostNotifs: Boolean?,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  @Json(name = "generate_totp_2fa")
  public val generateTotp2fa: Boolean?,
  public val auth: String,
) : Parcelable
