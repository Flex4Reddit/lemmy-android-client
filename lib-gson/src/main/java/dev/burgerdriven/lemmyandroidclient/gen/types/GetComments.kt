package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetComments(
  @SerializedName("type_")
  public val type: ListingType?,
  public val sort: CommentSortType?,
  @SerializedName("max_depth")
  public val maxDepth: Long?,
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  @SerializedName("community_name")
  public val communityName: String?,
  @SerializedName("post_id")
  public val postId: PostId?,
  @SerializedName("parent_id")
  public val parentId: CommentId?,
  @SerializedName("saved_only")
  public val savedOnly: Boolean?,
  public val auth: String?,
) : Parcelable
