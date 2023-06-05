package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ChangePassword(
  @Json(name = "new_password")
  public val newPassword: String,
  @Json(name = "new_password_verify")
  public val newPasswordVerify: String,
  @Json(name = "old_password")
  public val oldPassword: String,
  public val auth: String,
) : Parcelable
