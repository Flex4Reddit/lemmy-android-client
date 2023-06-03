package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class MarkPrivateMessageAsRead(
  @Json(name = "private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
