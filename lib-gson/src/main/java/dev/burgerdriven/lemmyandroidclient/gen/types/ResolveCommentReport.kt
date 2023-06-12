package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ResolveCommentReport(
  @SerializedName("report_id")
  public val reportId: CommentReportId,
  public val resolved: Boolean,
  public val auth: String,
) : Parcelable
