package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ApproveRegistrationApplication(
  public val id: Long,
  public val approve: Boolean,
  @Json(name = "deny_reason")
  public val denyReason: String?,
  public val auth: String,
) : Parcelable
