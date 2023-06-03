package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessage(
  public val id: PrivateMessageId,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "recipient_id")
  public val recipientId: PersonId,
  public val content: String,
  public val deleted: Boolean,
  public val read: Boolean,
  public val published: String,
  public val updated: String?,
  @Json(name = "ap_id")
  public val apId: String,
  public val local: Boolean,
) : Parcelable
