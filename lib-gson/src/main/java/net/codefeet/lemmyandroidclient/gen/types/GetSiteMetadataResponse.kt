package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetSiteMetadataResponse(
  public val metadata: SiteMetadata,
) : Parcelable
