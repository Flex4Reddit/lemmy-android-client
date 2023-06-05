package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import dev.burgerdriven.lemmyandroidclient.hotfix.FixListingType
import dev.burgerdriven.lemmyandroidclient.hotfix.FixSortType
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LocalUser(
  public val id: LocalUserId,
  @Json(name = "person_id")
  public val personId: PersonId,
  public val email: String?,
  @Json(name = "show_nsfw")
  public val showNsfw: Boolean,
  public val theme: String,
  @Json(name = "default_sort_type")
  @FixSortType
  public val defaultSortType: SortType,
  @Json(name = "default_listing_type")
  @FixListingType
  public val defaultListingType: ListingType,
  @Json(name = "interface_language")
  public val interfaceLanguage: String,
  @Json(name = "show_avatars")
  public val showAvatars: Boolean,
  @Json(name = "send_notifications_to_email")
  public val sendNotificationsToEmail: Boolean,
  @Json(name = "validator_time")
  public val validatorTime: String,
  @Json(name = "show_scores")
  public val showScores: Boolean,
  @Json(name = "show_bot_accounts")
  public val showBotAccounts: Boolean,
  @Json(name = "show_read_posts")
  public val showReadPosts: Boolean,
  @Json(name = "show_new_post_notifs")
  public val showNewPostNotifs: Boolean,
  @Json(name = "email_verified")
  public val emailVerified: Boolean,
  @Json(name = "accepted_application")
  public val acceptedApplication: Boolean,
  @Json(name = "totp_2fa_url")
  public val totp2faUrl: String?,
) : Parcelable
