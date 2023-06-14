package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityAggregates(
  public val id: Long,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val subscribers: Long,
  public val posts: Long,
  public val comments: Long,
  public val published: String,
  @SerializedName("users_active_day")
  public val usersActiveDay: Long,
  @SerializedName("users_active_week")
  public val usersActiveWeek: Long,
  @SerializedName("users_active_month")
  public val usersActiveMonth: Long,
  @SerializedName("users_active_half_year")
  public val usersActiveHalfYear: Long,
) : Parcelable
