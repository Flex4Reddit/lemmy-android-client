package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentAggregates(
  public val id: Long,
  @SerializedName("comment_id")
  public val commentId: CommentId,
  public val score: Long,
  public val upvotes: Long,
  public val downvotes: Long,
  public val published: String,
  @SerializedName("child_count")
  public val childCount: Long,
) : Parcelable
