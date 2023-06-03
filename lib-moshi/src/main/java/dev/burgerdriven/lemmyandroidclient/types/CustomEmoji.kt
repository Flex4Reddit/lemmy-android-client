package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CustomEmoji(
  public val id: CustomEmojiId,
  @Json(name = "local_site_id")
  public val localSiteId: LocalSiteId,
  public val shortcode: String,
  @Json(name = "image_url")
  public val imageUrl: String,
  @Json(name = "alt_text")
  public val altText: String,
  public val category: String,
  public val published: String,
  public val updated: String?,
) : Parcelable
