package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PasswordChangeAfterReset(
  public val token: String,
  public val password: String,
  @SerializedName("password_verify")
  public val passwordVerify: String,
) : Parcelable
