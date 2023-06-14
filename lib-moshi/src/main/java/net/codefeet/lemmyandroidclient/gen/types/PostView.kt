package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PostView(
  public val post: Post,
  public val creator: Person,
  public val community: Community,
  @Json(name = "creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  public val counts: PostAggregates,
  public val subscribed: SubscribedType,
  public val saved: Boolean,
  public val read: Boolean,
  @Json(name = "creator_blocked")
  public val creatorBlocked: Boolean,
  @Json(name = "my_vote")
  public val myVote: Long?,
  @Json(name = "unread_comments")
  public val unreadComments: Long,
) : Parcelable
