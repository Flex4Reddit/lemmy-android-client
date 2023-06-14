package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
public data class BlockCommunityResponse(
  @SerializedName("community_view")
  public val communityView: CommunityView,
  public val blocked: Boolean,
) : Parcelable
