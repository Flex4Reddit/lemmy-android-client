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
public data class GetComments(
  @Json(name = "type_")
  public val type: ListingType?,
  public val sort: CommentSortType?,
  @Json(name = "max_depth")
  public val maxDepth: Long?,
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "community_name")
  public val communityName: String?,
  @Json(name = "post_id")
  public val postId: PostId?,
  @Json(name = "parent_id")
  public val parentId: CommentId?,
  @Json(name = "saved_only")
  public val savedOnly: Boolean?,
  public val auth: String?,
) : Parcelable
