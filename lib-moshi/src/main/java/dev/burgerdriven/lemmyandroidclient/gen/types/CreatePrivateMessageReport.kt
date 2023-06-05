package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreatePrivateMessageReport(
  @Json(name = "private_message_id")
  public val privateMessageId: PrivateMessageId,
  public val reason: String,
  public val auth: String,
) : Parcelable
