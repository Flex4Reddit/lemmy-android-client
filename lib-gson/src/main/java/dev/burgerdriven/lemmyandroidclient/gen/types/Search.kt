package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Search(
  public val q: String,
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  @SerializedName("community_name")
  public val communityName: String?,
  @SerializedName("creator_id")
  public val creatorId: PersonId?,
  @SerializedName("type_")
  public val type: SearchType?,
  public val sort: SortType?,
  @SerializedName("listing_type")
  public val listingType: ListingType?,
  public val page: Long?,
  public val limit: Long?,
  public val auth: String?,
) : Parcelable
