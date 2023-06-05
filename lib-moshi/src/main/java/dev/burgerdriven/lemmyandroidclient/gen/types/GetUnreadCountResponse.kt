package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetUnreadCountResponse(
  public val replies: Long,
  public val mentions: Long,
  @Json(name = "private_messages")
  public val privateMessages: Long,
) : Parcelable
