package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreatePrivateMessageReport(
  @SerializedName("private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val reason: String,
  public val auth: String,
) : Parcelable
