package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PostReportView(
  @Json(name = "post_report")
  public val postReport: PostReport,
  public val post: Post,
  public val community: Community,
  public val creator: Person,
  @Json(name = "post_creator")
  public val postCreator: Person,
  @Json(name = "creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  @Json(name = "my_vote")
  public val myVote: Long?,
  public val counts: PostAggregates,
  public val resolver: Person?,
) : Parcelable
