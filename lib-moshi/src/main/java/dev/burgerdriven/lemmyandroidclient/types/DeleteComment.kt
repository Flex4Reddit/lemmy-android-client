package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class DeleteComment(
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val deleted: Boolean,
  public val auth: String,
) : Parcelable
