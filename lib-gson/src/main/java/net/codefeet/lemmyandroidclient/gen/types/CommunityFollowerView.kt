package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityFollowerView(
  public val community: Community,
  public val follower: Person,
) : Parcelable
