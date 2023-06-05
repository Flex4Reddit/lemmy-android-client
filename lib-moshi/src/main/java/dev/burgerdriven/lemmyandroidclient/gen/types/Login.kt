package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Login(
  @Json(name = "username_or_email")
  public val usernameOrEmail: String,
  public val password: String,
  @Json(name = "totp_2fa_token")
  public val totp2faToken: String?,
) : Parcelable
