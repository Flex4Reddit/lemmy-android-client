package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PersonMentionView(
  @Json(name = "person_mention")
  public val personMention: PersonMention,
  public val comment: Comment,
  public val creator: Person,
  public val post: Post,
  public val community: Community,
  public val recipient: Person,
  public val counts: CommentAggregates,
  @Json(name = "creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  public val subscribed: SubscribedType,
  public val saved: Boolean,
  @Json(name = "creator_blocked")
  public val creatorBlocked: Boolean,
  @Json(name = "my_vote")
  public val myVote: Long?,
) : Parcelable
