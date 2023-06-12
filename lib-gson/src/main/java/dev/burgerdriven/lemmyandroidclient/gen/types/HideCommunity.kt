package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class HideCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val hidden: Boolean,
  public val reason: String?,
  public val auth: String,
) : Parcelable
