package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostReportView(
  @SerializedName("post_report")
  public val postReport: PostReport,
  public val post: Post,
  public val community: Community,
  public val creator: Person,
  @SerializedName("post_creator")
  public val postCreator: Person,
  @SerializedName("creator_banned_from_community")
  public val creatorBannedFromCommunity: Boolean,
  @SerializedName("my_vote")
  public val myVote: Long?,
  public val counts: PostAggregates,
  public val resolver: Person?,
) : Parcelable
