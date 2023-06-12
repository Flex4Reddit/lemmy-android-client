package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class FollowCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val follow: Boolean,
  public val auth: String,
) : Parcelable
