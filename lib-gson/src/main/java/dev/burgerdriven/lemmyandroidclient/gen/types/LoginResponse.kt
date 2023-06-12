package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class LoginResponse(
  public val jwt: String?,
  @SerializedName("registration_created")
  public val registrationCreated: Boolean,
  @SerializedName("verify_email_sent")
  public val verifyEmailSent: Boolean,
) : Parcelable
