package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommunityAggregates(
  public val id: Long,
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val subscribers: Long,
  public val posts: Long,
  public val comments: Long,
  public val published: String,
  @Json(name = "users_active_day")
  public val usersActiveDay: Long,
  @Json(name = "users_active_week")
  public val usersActiveWeek: Long,
  @Json(name = "users_active_month")
  public val usersActiveMonth: Long,
  @Json(name = "users_active_half_year")
  public val usersActiveHalfYear: Long,
) : Parcelable
