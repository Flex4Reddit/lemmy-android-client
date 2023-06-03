package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CustomEmojiResponse(
  @Json(name = "custom_emoji")
  public val customEmoji: CustomEmojiView,
) : Parcelable
