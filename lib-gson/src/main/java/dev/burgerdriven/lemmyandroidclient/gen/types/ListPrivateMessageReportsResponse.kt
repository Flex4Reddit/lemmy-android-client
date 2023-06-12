package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListPrivateMessageReportsResponse(
  @SerializedName("private_message_reports")
  public val privateMessageReports: List<PrivateMessageReportView>,
) : Parcelable
