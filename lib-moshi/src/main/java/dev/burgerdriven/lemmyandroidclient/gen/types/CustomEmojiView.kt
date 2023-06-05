package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CustomEmojiView(
  @Json(name = "custom_emoji")
  public val customEmoji: CustomEmoji,
  public val keywords: List<CustomEmojiKeyword>,
) : Parcelable
