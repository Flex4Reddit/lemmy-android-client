package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetReportCountResponse(
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  @SerializedName("comment_reports")
  public val commentReports: Long,
  @SerializedName("post_reports")
  public val postReports: Long,
  @SerializedName("private_message_reports")
  public val privateMessageReports: Long?,
) : Parcelable
