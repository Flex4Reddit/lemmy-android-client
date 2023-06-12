package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListPostReportsResponse(
  @SerializedName("post_reports")
  public val postReports: List<PostReportView>,
) : Parcelable
