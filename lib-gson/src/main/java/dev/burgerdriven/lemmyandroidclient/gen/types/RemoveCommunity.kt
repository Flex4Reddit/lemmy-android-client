package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class RemoveCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val removed: Boolean,
  public val reason: String?,
  public val expires: Long?,
  public val auth: String,
) : Parcelable
