package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LocalSite(
  public val id: LocalSiteId,
  @Json(name = "site_id")
  public val siteId: SiteId,
  @Json(name = "site_setup")
  public val siteSetup: Boolean,
  @Json(name = "enable_downvotes")
  public val enableDownvotes: Boolean,
  @Json(name = "enable_nsfw")
  public val enableNsfw: Boolean,
  @Json(name = "community_creation_admin_only")
  public val communityCreationAdminOnly: Boolean,
  @Json(name = "require_email_verification")
  public val requireEmailVerification: Boolean,
  @Json(name = "application_question")
  public val applicationQuestion: String?,
  @Json(name = "private_instance")
  public val privateInstance: Boolean,
  @Json(name = "default_theme")
  public val defaultTheme: String,
  @Json(name = "default_post_listing_type")
  public val defaultPostListingType: ListingType,
  @Json(name = "legal_information")
  public val legalInformation: String?,
  @Json(name = "hide_modlog_mod_names")
  public val hideModlogModNames: Boolean,
  @Json(name = "application_email_admins")
  public val applicationEmailAdmins: Boolean,
  @Json(name = "slur_filter_regex")
  public val slurFilterRegex: String?,
  @Json(name = "actor_name_max_length")
  public val actorNameMaxLength: Long,
  @Json(name = "federation_enabled")
  public val federationEnabled: Boolean,
  @Json(name = "federation_debug")
  public val federationDebug: Boolean,
  @Json(name = "federation_worker_count")
  public val federationWorkerCount: Long,
  @Json(name = "captcha_enabled")
  public val captchaEnabled: Boolean,
  @Json(name = "captcha_difficulty")
  public val captchaDifficulty: String,
  public val published: String,
  public val updated: String?,
  @Json(name = "registration_mode")
  public val registrationMode: RegistrationMode,
  @Json(name = "reports_email_admins")
  public val reportsEmailAdmins: Boolean,
) : Parcelable
