package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommentReport(
  public val id: CommentReportId,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "comment_id")
  public val commentId: CommentId,
  @Json(name = "original_comment_text")
  public val originalCommentText: String,
  public val reason: String,
  public val resolved: Boolean,
  @Json(name = "resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
