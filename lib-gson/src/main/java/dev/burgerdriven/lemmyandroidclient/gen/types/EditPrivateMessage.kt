package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class EditPrivateMessage(
  @SerializedName("private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val content: String,
  public val auth: String,
) : Parcelable
