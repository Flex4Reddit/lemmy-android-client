package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModJoin(
  @SerializedName("community_id")
  public val communityId: CommunityId,
) : Parcelable
