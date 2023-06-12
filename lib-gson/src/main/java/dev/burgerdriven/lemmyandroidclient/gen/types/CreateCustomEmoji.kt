package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreateCustomEmoji(
  public val category: String,
  public val shortcode: String,
  @SerializedName("image_url")
  public val imageUrl: String,
  @SerializedName("alt_text")
  public val altText: String,
  public val keywords: List<String>,
  public val auth: String,
) : Parcelable
