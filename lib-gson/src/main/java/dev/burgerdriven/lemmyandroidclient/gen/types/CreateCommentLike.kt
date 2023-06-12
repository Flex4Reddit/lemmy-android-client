package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreateCommentLike(
  @SerializedName("comment_id")
  public val commentId: CommentId,
  public val score: Long,
  public val auth: String,
) : Parcelable
