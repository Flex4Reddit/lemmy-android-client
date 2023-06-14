package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class SiteAggregates(
  public val id: Long,
  @Json(name = "site_id")
  public val siteId: SiteId,
  public val users: Long,
  public val posts: Long,
  public val comments: Long,
  public val communities: Long,
  @Json(name = "users_active_day")
  public val usersActiveDay: Long,
  @Json(name = "users_active_week")
  public val usersActiveWeek: Long,
  @Json(name = "users_active_month")
  public val usersActiveMonth: Long,
  @Json(name = "users_active_half_year")
  public val usersActiveHalfYear: Long,
) : Parcelable
