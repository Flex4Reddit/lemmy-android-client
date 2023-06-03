package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessagesResponse(
  @Json(name = "private_messages")
  public val privateMessages: List<PrivateMessageView>,
) : Parcelable
