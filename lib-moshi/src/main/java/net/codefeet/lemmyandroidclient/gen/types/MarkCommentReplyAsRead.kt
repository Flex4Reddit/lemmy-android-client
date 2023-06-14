package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class MarkCommentReplyAsRead(
  @Json(name = "comment_reply_id")
  public val commentReplyId: CommentReplyId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
