package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReply(
  public val id: CommentReplyId,
  @SerializedName("recipient_id")
  public val recipientId: PersonId,
  @SerializedName("comment_id")
  public val commentId: CommentId,
  public val read: Boolean,
  public val published: String,
) : Parcelable
