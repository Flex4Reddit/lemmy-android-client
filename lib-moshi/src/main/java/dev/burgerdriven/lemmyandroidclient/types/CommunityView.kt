package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommunityView(
  public val community: Community,
  public val subscribed: SubscribedType,
  public val blocked: Boolean,
  public val counts: CommunityAggregates,
) : Parcelable
