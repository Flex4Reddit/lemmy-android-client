package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReplyView(
  @SerializedName("comment_reply")
  public val commentReply: CommentReply,
  public val comment: Comment,
  public val creator: Person,
  public val post: Post,
  public val community: Community,
  public val recipient: Person,
  public val counts: CommentAggregates,
  @SerializedName("creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  public val subscribed: SubscribedType,
  public val saved: Boolean,
  @SerializedName("creator_blocked")
  public val creatorBlocked: Boolean,
  @SerializedName("my_vote")
  public val myVote: Long?,
) : Parcelable
