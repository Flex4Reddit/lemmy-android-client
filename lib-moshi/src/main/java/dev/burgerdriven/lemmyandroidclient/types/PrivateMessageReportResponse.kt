package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessageReportResponse(
  @Json(name = "private_message_report_view")
  public val privateMessageReportView: PrivateMessageReportView,
) : Parcelable
