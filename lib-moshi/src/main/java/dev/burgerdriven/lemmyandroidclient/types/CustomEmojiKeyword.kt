package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CustomEmojiKeyword(
  public val id: Long,
  @Json(name = "custom_emoji_id")
  public val customEmojiId: CustomEmojiId,
  public val keyword: String,
) : Parcelable
