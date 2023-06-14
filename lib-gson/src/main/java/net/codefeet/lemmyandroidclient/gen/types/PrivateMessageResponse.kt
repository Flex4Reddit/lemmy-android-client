package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessageResponse(
  @SerializedName("private_message_view")
  public val privateMessageView: PrivateMessageView,
) : Parcelable
