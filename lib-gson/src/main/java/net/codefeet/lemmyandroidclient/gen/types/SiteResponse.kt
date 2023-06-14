package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SiteResponse(
  @SerializedName("site_view")
  public val siteView: SiteView,
) : Parcelable
