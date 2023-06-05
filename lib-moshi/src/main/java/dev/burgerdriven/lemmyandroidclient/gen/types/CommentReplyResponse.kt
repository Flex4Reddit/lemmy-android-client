package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommentReplyResponse(
  @Json(name = "comment_reply_view")
  public val commentReplyView: CommentReplyView,
) : Parcelable
