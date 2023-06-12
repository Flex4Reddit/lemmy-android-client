package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class MarkCommentReplyAsRead(
  @SerializedName("comment_reply_id")
  public val commentReplyId: CommentReplyId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
