package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentView(
  public val comment: Comment,
  public val creator: Person,
  public val post: Post,
  public val community: Community,
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
