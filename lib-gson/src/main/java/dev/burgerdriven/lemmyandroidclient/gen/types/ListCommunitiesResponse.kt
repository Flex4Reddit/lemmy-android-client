package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListCommunitiesResponse(
  public val communities: List<CommunityView>,
) : Parcelable
