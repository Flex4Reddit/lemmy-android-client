package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommentReportView(
  @Json(name = "comment_report")
  public val commentReport: CommentReport,
  public val comment: Comment,
  public val post: Post,
  public val community: Community,
  public val creator: Person,
  @Json(name = "comment_creator")
  public val commentCreator: Person,
  public val counts: CommentAggregates,
  @Json(name = "creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  @Json(name = "my_vote")
  public val myVote: Long?,
  public val resolver: Person?,
) : Parcelable
