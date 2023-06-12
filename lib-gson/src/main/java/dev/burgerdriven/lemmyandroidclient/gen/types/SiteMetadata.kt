package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SiteMetadata(
  public val title: String?,
  public val description: String?,
  public val image: String?,
  @SerializedName("embed_video_url")
  public val embedVideoUrl: String?,
) : Parcelable
