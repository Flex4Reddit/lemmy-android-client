package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class LocalSite(
  public val id: LocalSiteId,
  @SerializedName("site_id")
  public val siteId: SiteId,
  @SerializedName("site_setup")
  public val siteSetup: Boolean,
  @SerializedName("enable_downvotes")
  public val enableDownvotes: Boolean,
  @SerializedName("enable_nsfw")
  public val enableNsfw: Boolean,
  @SerializedName("community_creation_admin_only")
  public val communityCreationAdminOnly: Boolean,
  @SerializedName("require_email_verification")
  public val requireEmailVerification: Boolean,
  @SerializedName("application_question")
  public val applicationQuestion: String?,
  @SerializedName("private_instance")
  public val privateInstance: Boolean,
  @SerializedName("default_theme")
  public val defaultTheme: String,
  @SerializedName("default_post_listing_type")
  public val defaultPostListingType: ListingType,
  @SerializedName("legal_information")
  public val legalInformation: String?,
  @SerializedName("hide_modlog_mod_names")
  public val hideModlogModNames: Boolean,
  @SerializedName("application_email_admins")
  public val applicationEmailAdmins: Boolean,
  @SerializedName("slur_filter_regex")
  public val slurFilterRegex: String?,
  @SerializedName("actor_name_max_length")
  public val actorNameMaxLength: Long,
  @SerializedName("federation_enabled")
  public val federationEnabled: Boolean,
  @SerializedName("federation_debug")
  public val federationDebug: Boolean,
  @SerializedName("federation_worker_count")
  public val federationWorkerCount: Long,
  @SerializedName("captcha_enabled")
  public val captchaEnabled: Boolean,
  @SerializedName("captcha_difficulty")
  public val captchaDifficulty: String,
  public val published: String,
  public val updated: String?,
  @SerializedName("registration_mode")
  public val registrationMode: RegistrationMode,
  @SerializedName("reports_email_admins")
  public val reportsEmailAdmins: Boolean,
) : Parcelable
