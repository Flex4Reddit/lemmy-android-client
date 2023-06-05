package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetReportCountResponse(
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "comment_reports")
  public val commentReports: Long,
  @Json(name = "post_reports")
  public val postReports: Long,
  @Json(name = "private_message_reports")
  public val privateMessageReports: Long?,
) : Parcelable
