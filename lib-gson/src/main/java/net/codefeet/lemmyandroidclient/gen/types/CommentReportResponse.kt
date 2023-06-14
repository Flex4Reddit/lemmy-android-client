package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentReportResponse(
  @SerializedName("comment_report_view")
  public val commentReportView: CommentReportView,
) : Parcelable
