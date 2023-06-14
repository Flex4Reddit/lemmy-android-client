package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ResolvePostReport(
  @SerializedName("report_id")
  public val reportId: PostReportId,
  public val resolved: Boolean,
  public val auth: String,
) : Parcelable
