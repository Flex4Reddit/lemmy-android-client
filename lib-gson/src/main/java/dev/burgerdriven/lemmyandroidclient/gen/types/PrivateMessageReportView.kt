package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessageReportView(
  @SerializedName("private_message_report")
  public val privateMessageReport: PrivateMessageReport,
  @SerializedName("private_message")
  public val privateMessage: PrivateMessage,
  @SerializedName("private_message_creator")
  public val privateMessageCreator: Person,
  public val creator: Person,
  public val resolver: Person?,
) : Parcelable
