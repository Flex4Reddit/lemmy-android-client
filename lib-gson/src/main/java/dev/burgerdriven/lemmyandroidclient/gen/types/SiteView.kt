package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SiteView(
  public val site: Site,
  @SerializedName("local_site")
  public val localSite: LocalSite,
  @SerializedName("local_site_rate_limit")
  public val localSiteRateLimit: LocalSiteRateLimit,
  public val counts: SiteAggregates,
) : Parcelable
