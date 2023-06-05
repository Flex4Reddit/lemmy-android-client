package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class EditPrivateMessage(
  @Json(name = "private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val content: String,
  public val auth: String,
) : Parcelable
