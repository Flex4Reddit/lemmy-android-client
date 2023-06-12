package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReportView(
  @SerializedName("comment_report")
  public val commentReport: CommentReport,
  public val comment: Comment,
  public val post: Post,
  public val community: Community,
  public val creator: Person,
  @SerializedName("comment_creator")
  public val commentCreator: Person,
  public val counts: CommentAggregates,
  @SerializedName("creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  @SerializedName("my_vote")
  public val myVote: Long?,
  public val resolver: Person?,
) : Parcelable
