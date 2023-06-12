package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReplyResponse(
  @SerializedName("comment_reply_view")
  public val commentReplyView: CommentReplyView,
) : Parcelable
