package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Tagline(
  public val id: Long,
  @Json(name = "local_site_id")
  public val localSiteId: LocalSiteId,
  public val content: String,
  public val published: String,
  public val updated: String?,
) : Parcelable
