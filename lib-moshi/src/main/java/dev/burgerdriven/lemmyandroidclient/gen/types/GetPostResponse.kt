package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetPostResponse(
  @Json(name = "post_view")
  public val postView: PostView,
  @Json(name = "community_view")
  public val communityView: CommunityView,
  public val moderators: List<CommunityModeratorView>,
  @Json(name = "cross_posts")
  public val crossPosts: List<PostView>,
  public val online: Long,
) : Parcelable
