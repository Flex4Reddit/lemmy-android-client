package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostView(
  public val post: Post,
  public val creator: Person,
  public val community: Community,
  @SerializedName("creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  public val counts: PostAggregates,
  public val subscribed: SubscribedType,
  public val saved: Boolean,
  public val read: Boolean,
  @SerializedName("creator_blocked")
  public val creatorBlocked: Boolean,
  @SerializedName("my_vote")
  public val myVote: Long?,
  @SerializedName("unread_comments")
  public val unreadComments: Long,
) : Parcelable
