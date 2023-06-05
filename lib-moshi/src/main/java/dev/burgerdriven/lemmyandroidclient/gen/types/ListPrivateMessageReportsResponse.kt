package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ListPrivateMessageReportsResponse(
  @Json(name = "private_message_reports")
  public val privateMessageReports: List<PrivateMessageReportView>,
) : Parcelable
