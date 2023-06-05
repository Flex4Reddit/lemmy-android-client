package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PostAggregates(
  public val id: Long,
  @Json(name = "post_id")
  public val postId: PostId,
  public val comments: Long,
  public val score: Long,
  public val upvotes: Long,
  public val downvotes: Long,
  public val published: String,
  @Json(name = "newest_comment_time_necro")
  public val newestCommentTimeNecro: String,
  @Json(name = "newest_comment_time")
  public val newestCommentTime: String,
  @Json(name = "featured_community")
  public val featuredCommunity: Boolean,
  @Json(name = "featured_local")
  public val featuredLocal: Boolean,
) : Parcelable
