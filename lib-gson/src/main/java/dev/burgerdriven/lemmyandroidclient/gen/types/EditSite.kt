package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class EditSite(
  public val name: String?,
  public val sidebar: String?,
  public val description: String?,
  public val icon: String?,
  public val banner: String?,
  @SerializedName("enable_downvotes")
  public val enableDownvotes: Boolean?,
  @SerializedName("enable_nsfw")
  public val enableNsfw: Boolean?,
  @SerializedName("community_creation_admin_only")
  public val communityCreationAdminOnly: Boolean?,
  @SerializedName("require_email_verification")
  public val requireEmailVerification: Boolean?,
  @SerializedName("application_question")
  public val applicationQuestion: String?,
  @SerializedName("private_instance")
  public val privateInstance: Boolean?,
  @SerializedName("default_theme")
  public val defaultTheme: String?,
  @SerializedName("default_post_listing_type")
  public val defaultPostListingType: ListingType?,
  @SerializedName("legal_information")
  public val legalInformation: String?,
  @SerializedName("application_email_admins")
  public val applicationEmailAdmins: Boolean?,
  @SerializedName("hide_modlog_mod_names")
  public val hideModlogModNames: Boolean?,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  @SerializedName("slur_filter_regex")
  public val slurFilterRegex: String?,
  @SerializedName("actor_name_max_length")
  public val actorNameMaxLength: Long?,
  @SerializedName("rate_limit_message")
  public val rateLimitMessage: Long?,
  @SerializedName("rate_limit_message_per_second")
  public val rateLimitMessagePerSecond: Long?,
  @SerializedName("rate_limit_post")
  public val rateLimitPost: Long?,
  @SerializedName("rate_limit_post_per_second")
  public val rateLimitPostPerSecond: Long?,
  @SerializedName("rate_limit_register")
  public val rateLimitRegister: Long?,
  @SerializedName("rate_limit_register_per_second")
  public val rateLimitRegisterPerSecond: Long?,
  @SerializedName("rate_limit_image")
  public val rateLimitImage: Long?,
  @SerializedName("rate_limit_image_per_second")
  public val rateLimitImagePerSecond: Long?,
  @SerializedName("rate_limit_comment")
  public val rateLimitComment: Long?,
  @SerializedName("rate_limit_comment_per_second")
  public val rateLimitCommentPerSecond: Long?,
  @SerializedName("rate_limit_search")
  public val rateLimitSearch: Long?,
  @SerializedName("rate_limit_search_per_second")
  public val rateLimitSearchPerSecond: Long?,
  @SerializedName("federation_enabled")
  public val federationEnabled: Boolean?,
  @SerializedName("federation_debug")
  public val federationDebug: Boolean?,
  @SerializedName("federation_worker_count")
  public val federationWorkerCount: Long?,
  @SerializedName("captcha_enabled")
  public val captchaEnabled: Boolean?,
  @SerializedName("captcha_difficulty")
  public val captchaDifficulty: String?,
  @SerializedName("allowed_instances")
  public val allowedInstances: List<String>?,
  @SerializedName("blocked_instances")
  public val blockedInstances: List<String>?,
  public val taglines: List<String>?,
  @SerializedName("registration_mode")
  public val registrationMode: RegistrationMode?,
  @SerializedName("reports_email_admins")
  public val reportsEmailAdmins: Boolean?,
  public val auth: String,
) : Parcelable
