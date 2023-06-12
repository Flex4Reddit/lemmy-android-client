package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SaveUserSettings(
  @SerializedName("show_nsfw")
  public val showNsfw: Boolean?,
  @SerializedName("show_scores")
  public val showScores: Boolean?,
  public val theme: String?,
  @SerializedName("default_sort_type")
  public val defaultSortType: SortType?,
  @SerializedName("default_listing_type")
  public val defaultListingType: ListingType?,
  @SerializedName("interface_language")
  public val interfaceLanguage: String?,
  public val avatar: String?,
  public val banner: String?,
  @SerializedName("display_name")
  public val displayName: String?,
  public val email: String?,
  public val bio: String?,
  @SerializedName("matrix_user_id")
  public val matrixUserId: String?,
  @SerializedName("show_avatars")
  public val showAvatars: Boolean?,
  @SerializedName("send_notifications_to_email")
  public val sendNotificationsToEmail: Boolean?,
  @SerializedName("bot_account")
  public val botAccount: Boolean?,
  @SerializedName("show_bot_accounts")
  public val showBotAccounts: Boolean?,
  @SerializedName("show_read_posts")
  public val showReadPosts: Boolean?,
  @SerializedName("show_new_post_notifs")
  public val showNewPostNotifs: Boolean?,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  @SerializedName("generate_totp_2fa")
  public val generateTotp2fa: Boolean?,
  public val auth: String,
) : Parcelable
