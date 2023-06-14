package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessagesResponse(
  @SerializedName("private_messages")
  public val privateMessages: List<PrivateMessageView>,
) : Parcelable
