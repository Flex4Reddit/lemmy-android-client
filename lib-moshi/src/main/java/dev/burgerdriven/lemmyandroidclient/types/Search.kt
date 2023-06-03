package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Search(
  public val q: String,
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "community_name")
  public val communityName: String?,
  @Json(name = "creator_id")
  public val creatorId: PersonId?,
  @Json(name = "type_")
  public val type: SearchType?,
  public val sort: SortType?,
  @Json(name = "listing_type")
  public val listingType: ListingType?,
  public val page: Long?,
  public val limit: Long?,
  public val auth: String?,
) : Parcelable
