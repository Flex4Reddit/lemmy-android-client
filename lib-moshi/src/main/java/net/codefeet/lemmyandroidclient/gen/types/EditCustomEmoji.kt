package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class EditCustomEmoji(
  public val id: CustomEmojiId,
  public val category: String,
  @Json(name = "image_url")
  public val imageUrl: String,
  @Json(name = "alt_text")
  public val altText: String,
  public val keywords: List<String>,
  public val auth: String,
) : Parcelable
