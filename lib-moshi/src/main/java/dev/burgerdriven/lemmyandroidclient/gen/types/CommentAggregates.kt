package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommentAggregates(
  public val id: Long,
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val score: Long,
  public val upvotes: Long,
  public val downvotes: Long,
  public val published: String,
  @Json(name = "child_count")
  public val childCount: Long,
) : Parcelable
