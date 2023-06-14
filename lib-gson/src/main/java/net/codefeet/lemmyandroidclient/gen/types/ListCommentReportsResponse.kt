package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListCommentReportsResponse(
  @SerializedName("comment_reports")
  public val commentReports: List<CommentReportView>,
) : Parcelable
