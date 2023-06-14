package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPostResponse(
  @SerializedName("post_view")
  public val postView: PostView,
  @SerializedName("community_view")
  public val communityView: CommunityView,
  public val moderators: List<CommunityModeratorView>,
  @SerializedName("cross_posts")
  public val crossPosts: List<PostView>,
  public val online: Long,
) : Parcelable
