package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class VerifyEmail(
  public val token: String,
) : Parcelable
