package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetUnreadCountResponse(
  public val replies: Long,
  public val mentions: Long,
  @SerializedName("private_messages")
  public val privateMessages: Long,
) : Parcelable
