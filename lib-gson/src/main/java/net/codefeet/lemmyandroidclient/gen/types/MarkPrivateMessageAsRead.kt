package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class MarkPrivateMessageAsRead(
  @SerializedName("private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
