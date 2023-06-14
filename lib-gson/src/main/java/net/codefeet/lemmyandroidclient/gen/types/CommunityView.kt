package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityView(
  public val community: Community,
  public val subscribed: SubscribedType,
  public val blocked: Boolean,
  public val counts: CommunityAggregates,
) : Parcelable
