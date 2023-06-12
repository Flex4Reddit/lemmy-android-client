package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SiteAggregates(
  public val id: Long,
  @SerializedName("site_id")
  public val siteId: SiteId,
  public val users: Long,
  public val posts: Long,
  public val comments: Long,
  public val communities: Long,
  @SerializedName("users_active_day")
  public val usersActiveDay: Long,
  @SerializedName("users_active_week")
  public val usersActiveWeek: Long,
  @SerializedName("users_active_month")
  public val usersActiveMonth: Long,
  @SerializedName("users_active_half_year")
  public val usersActiveHalfYear: Long,
) : Parcelable
