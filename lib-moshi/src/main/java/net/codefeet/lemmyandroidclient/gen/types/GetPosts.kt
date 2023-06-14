package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetPosts(
  @Json(name = "type_")
  public val type: ListingType?,
  public val sort: SortType?,
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "community_name")
  public val communityName: String?,
  @Json(name = "saved_only")
  public val savedOnly: Boolean?,
  public val auth: String?,
) : Parcelable
