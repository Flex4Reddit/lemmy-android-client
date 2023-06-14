package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class LocalUser(
  public val id: LocalUserId,
  @SerializedName("person_id")
  public val personId: PersonId,
  public val email: String?,
  @SerializedName("show_nsfw")
  public val showNsfw: Boolean,
  public val theme: String,
  @SerializedName("default_sort_type")
  public val defaultSortType: SortType,
  @SerializedName("default_listing_type")
  public val defaultListingType: ListingType,
  @SerializedName("interface_language")
  public val interfaceLanguage: String,
  @SerializedName("show_avatars")
  public val showAvatars: Boolean,
  @SerializedName("send_notifications_to_email")
  public val sendNotificationsToEmail: Boolean,
  @SerializedName("validator_time")
  public val validatorTime: String,
  @SerializedName("show_scores")
  public val showScores: Boolean,
  @SerializedName("show_bot_accounts")
  public val showBotAccounts: Boolean,
  @SerializedName("show_read_posts")
  public val showReadPosts: Boolean,
  @SerializedName("show_new_post_notifs")
  public val showNewPostNotifs: Boolean,
  @SerializedName("email_verified")
  public val emailVerified: Boolean,
  @SerializedName("accepted_application")
  public val acceptedApplication: Boolean,
  @SerializedName("totp_2fa_url")
  public val totp2faUrl: String?,
) : Parcelable
