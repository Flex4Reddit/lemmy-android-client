package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReport(
  public val id: CommentReportId,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("comment_id")
  public val commentId: CommentId,
  @SerializedName("original_comment_text")
  public val originalCommentText: String,
  public val reason: String,
  public val resolved: Boolean,
  @SerializedName("resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
