package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ListCommentReportsResponse(
  @Json(name = "comment_reports")
  public val commentReports: List<CommentReportView>,
) : Parcelable
