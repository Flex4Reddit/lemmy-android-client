package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class SiteMetadata(
  public val title: String?,
  public val description: String?,
  public val image: String?,
  @Json(name = "embed_video_url")
  public val embedVideoUrl: String?,
) : Parcelable
