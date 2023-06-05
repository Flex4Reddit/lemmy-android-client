package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LoginResponse(
  public val jwt: String?,
  @Json(name = "registration_created")
  public val registrationCreated: Boolean,
  @Json(name = "verify_email_sent")
  public val verifyEmailSent: Boolean,
) : Parcelable
