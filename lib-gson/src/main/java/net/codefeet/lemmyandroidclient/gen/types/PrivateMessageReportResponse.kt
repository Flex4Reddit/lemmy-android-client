package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessageReportResponse(
  @SerializedName("private_message_report_view")
  public val privateMessageReportView: PrivateMessageReportView,
) : Parcelable
