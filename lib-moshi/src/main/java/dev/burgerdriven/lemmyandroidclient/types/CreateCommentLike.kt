package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreateCommentLike(
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val score: Long,
  public val auth: String,
) : Parcelable
