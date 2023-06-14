package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityBlockView(
  public val person: Person,
  public val community: Community,
) : Parcelable
