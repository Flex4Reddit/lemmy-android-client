package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessageReportView(
  @Json(name = "private_message_report")
  public val privateMessageReport: PrivateMessageReport,
  @Json(name = "private_message")
  public val privateMessage: PrivateMessage,
  @Json(name = "private_message_creator")
  public val privateMessageCreator: Person,
  public val creator: Person,
  public val resolver: Person?,
) : Parcelable
