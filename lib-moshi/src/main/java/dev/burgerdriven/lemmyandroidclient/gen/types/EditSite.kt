package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class EditSite(
  public val name: String?,
  public val sidebar: String?,
  public val description: String?,
  public val icon: String?,
  public val banner: String?,
  @Json(name = "enable_downvotes")
  public val enableDownvotes: Boolean?,
  @Json(name = "enable_nsfw")
  public val enableNsfw: Boolean?,
  @Json(name = "community_creation_admin_only")
  public val communityCreationAdminOnly: Boolean?,
  @Json(name = "require_email_verification")
  public val requireEmailVerification: Boolean?,
  @Json(name = "application_question")
  public val applicationQuestion: String?,
  @Json(name = "private_instance")
  public val privateInstance: Boolean?,
  @Json(name = "default_theme")
  public val defaultTheme: String?,
  @Json(name = "default_post_listing_type")
  public val defaultPostListingType: ListingType?,
  @Json(name = "legal_information")
  public val legalInformation: String?,
  @Json(name = "application_email_admins")
  public val applicationEmailAdmins: Boolean?,
  @Json(name = "hide_modlog_mod_names")
  public val hideModlogModNames: Boolean?,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  @Json(name = "slur_filter_regex")
  public val slurFilterRegex: String?,
  @Json(name = "actor_name_max_length")
  public val actorNameMaxLength: Long?,
  @Json(name = "rate_limit_message")
  public val rateLimitMessage: Long?,
  @Json(name = "rate_limit_message_per_second")
  public val rateLimitMessagePerSecond: Long?,
  @Json(name = "rate_limit_post")
  public val rateLimitPost: Long?,
  @Json(name = "rate_limit_post_per_second")
  public val rateLimitPostPerSecond: Long?,
  @Json(name = "rate_limit_register")
  public val rateLimitRegister: Long?,
  @Json(name = "rate_limit_register_per_second")
  public val rateLimitRegisterPerSecond: Long?,
  @Json(name = "rate_limit_image")
  public val rateLimitImage: Long?,
  @Json(name = "rate_limit_image_per_second")
  public val rateLimitImagePerSecond: Long?,
  @Json(name = "rate_limit_comment")
  public val rateLimitComment: Long?,
  @Json(name = "rate_limit_comment_per_second")
  public val rateLimitCommentPerSecond: Long?,
  @Json(name = "rate_limit_search")
  public val rateLimitSearch: Long?,
  @Json(name = "rate_limit_search_per_second")
  public val rateLimitSearchPerSecond: Long?,
  @Json(name = "federation_enabled")
  public val federationEnabled: Boolean?,
  @Json(name = "federation_debug")
  public val federationDebug: Boolean?,
  @Json(name = "federation_worker_count")
  public val federationWorkerCount: Long?,
  @Json(name = "captcha_enabled")
  public val captchaEnabled: Boolean?,
  @Json(name = "captcha_difficulty")
  public val captchaDifficulty: String?,
  @Json(name = "allowed_instances")
  public val allowedInstances: List<String>?,
  @Json(name = "blocked_instances")
  public val blockedInstances: List<String>?,
  public val taglines: List<String>?,
  @Json(name = "registration_mode")
  public val registrationMode: RegistrationMode?,
  @Json(name = "reports_email_admins")
  public val reportsEmailAdmins: Boolean?,
  public val auth: String,
) : Parcelable
