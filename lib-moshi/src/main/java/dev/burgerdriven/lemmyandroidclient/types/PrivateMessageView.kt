package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessageView(
  @Json(name = "private_message")
  public val privateMessage: PrivateMessage,
  public val creator: Person,
  public val recipient: Person,
) : Parcelable
