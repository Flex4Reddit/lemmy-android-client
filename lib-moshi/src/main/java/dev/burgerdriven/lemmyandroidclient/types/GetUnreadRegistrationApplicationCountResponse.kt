package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetUnreadRegistrationApplicationCountResponse(
  @Json(name = "registration_applications")
  public val registrationApplications: Long,
) : Parcelable
