package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ResolveCommentReport(
  @Json(name = "report_id")
  public val reportId: CommentReportId,
  public val resolved: Boolean,
  public val auth: String,
) : Parcelable
