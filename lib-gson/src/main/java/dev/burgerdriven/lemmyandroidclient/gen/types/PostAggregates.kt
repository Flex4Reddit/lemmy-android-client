package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostAggregates(
  public val id: Long,
  @SerializedName("post_id")
  public val postId: PostId,
  public val comments: Long,
  public val score: Long,
  public val upvotes: Long,
  public val downvotes: Long,
  public val published: String,
  @SerializedName("newest_comment_time_necro")
  public val newestCommentTimeNecro: String,
  @SerializedName("newest_comment_time")
  public val newestCommentTime: String,
  @SerializedName("featured_community")
  public val featuredCommunity: Boolean,
  @SerializedName("featured_local")
  public val featuredLocal: Boolean,
) : Parcelable
