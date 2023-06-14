package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostReportResponse(
  @SerializedName("post_report_view")
  public val postReportView: PostReportView,
) : Parcelable
