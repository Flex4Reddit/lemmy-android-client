package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreateCustomEmoji(
  public val category: String,
  public val shortcode: String,
  @Json(name = "image_url")
  public val imageUrl: String,
  @Json(name = "alt_text")
  public val altText: String,
  public val keywords: List<String>,
  public val auth: String,
) : Parcelable
