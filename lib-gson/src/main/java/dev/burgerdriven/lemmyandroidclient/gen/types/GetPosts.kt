package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPosts(
  @SerializedName("type_")
  public val type: ListingType?,
  public val sort: SortType?,
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  @SerializedName("community_name")
  public val communityName: String?,
  @SerializedName("saved_only")
  public val savedOnly: Boolean?,
  public val auth: String?,
) : Parcelable
