package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PurgeCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val reason: String?,
  public val auth: String,
) : Parcelable
