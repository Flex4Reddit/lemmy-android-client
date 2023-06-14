package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PasswordChangeAfterReset(
  public val token: String,
  public val password: String,
  @Json(name = "password_verify")
  public val passwordVerify: String,
) : Parcelable
