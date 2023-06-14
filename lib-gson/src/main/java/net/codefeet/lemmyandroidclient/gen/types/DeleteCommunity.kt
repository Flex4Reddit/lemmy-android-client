package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class DeleteCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val deleted: Boolean,
  public val auth: String,
) : Parcelable
