package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Register(
  public val username: String,
  public val password: String,
  @Json(name = "password_verify")
  public val passwordVerify: String,
  @Json(name = "show_nsfw")
  public val showNsfw: Boolean,
  public val email: String?,
  @Json(name = "captcha_uuid")
  public val captchaUuid: String?,
  @Json(name = "captcha_answer")
  public val captchaAnswer: String?,
  public val honeypot: String?,
  public val answer: String?,
) : Parcelable
