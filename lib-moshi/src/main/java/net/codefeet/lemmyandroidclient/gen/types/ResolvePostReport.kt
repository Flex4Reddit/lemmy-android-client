package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ResolvePostReport(
  @Json(name = "report_id")
  public val reportId: PostReportId,
  public val resolved: Boolean,
  public val auth: String,
) : Parcelable
