package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Login(
  @SerializedName("username_or_email")
  public val usernameOrEmail: String,
  public val password: String,
  @SerializedName("totp_2fa_token")
  public val totp2faToken: String?,
) : Parcelable
