package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class SiteView(
  public val site: Site,
  @Json(name = "local_site")
  public val localSite: LocalSite,
  @Json(name = "local_site_rate_limit")
  public val localSiteRateLimit: LocalSiteRateLimit,
  public val counts: SiteAggregates,
) : Parcelable
