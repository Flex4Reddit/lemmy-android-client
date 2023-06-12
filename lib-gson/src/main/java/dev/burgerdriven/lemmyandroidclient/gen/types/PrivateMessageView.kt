package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessageView(
  @SerializedName("private_message")
  public val privateMessage: PrivateMessage,
  public val creator: Person,
  public val recipient: Person,
) : Parcelable
