package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityJoin(
  @SerializedName("community_id")
  public val communityId: CommunityId,
) : Parcelable
