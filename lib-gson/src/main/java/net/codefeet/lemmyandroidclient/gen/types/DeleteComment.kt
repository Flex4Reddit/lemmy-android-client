package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class DeleteComment(
  @SerializedName("comment_id")
  public val commentId: CommentId,
  public val deleted: Boolean,
  public val auth: String,
) : Parcelable
