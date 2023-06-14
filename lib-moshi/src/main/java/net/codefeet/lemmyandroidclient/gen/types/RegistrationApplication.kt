package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class RegistrationApplication(
  public val id: Long,
  @Json(name = "local_user_id")
  public val localUserId: LocalUserId,
  public val answer: String,
  @Json(name = "admin_id")
  public val adminId: PersonId?,
  @Json(name = "deny_reason")
  public val denyReason: String?,
  public val published: String,
) : Parcelable
