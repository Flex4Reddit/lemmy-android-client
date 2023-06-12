package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ChangePassword(
  @SerializedName("new_password")
  public val newPassword: String,
  @SerializedName("new_password_verify")
  public val newPasswordVerify: String,
  @SerializedName("old_password")
  public val oldPassword: String,
  public val auth: String,
) : Parcelable
