package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CustomEmoji(
  public val id: CustomEmojiId,
  @SerializedName("local_site_id")
  public val localSiteId: LocalSiteId,
  public val shortcode: String,
  @SerializedName("image_url")
  public val imageUrl: String,
  @SerializedName("alt_text")
  public val altText: String,
  public val category: String,
  public val published: String,
  public val updated: String?,
) : Parcelable
