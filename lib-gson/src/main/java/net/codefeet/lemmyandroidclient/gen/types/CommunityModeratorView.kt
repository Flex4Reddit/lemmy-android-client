package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityModeratorView(
  public val community: Community,
  public val moderator: Person,
) : Parcelable
