package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Register(
  public val username: String,
  public val password: String,
  @SerializedName("password_verify")
  public val passwordVerify: String,
  @SerializedName("show_nsfw")
  public val showNsfw: Boolean,
  public val email: String?,
  @SerializedName("captcha_uuid")
  public val captchaUuid: String?,
  @SerializedName("captcha_answer")
  public val captchaAnswer: String?,
  public val honeypot: String?,
  public val answer: String?,
) : Parcelable
