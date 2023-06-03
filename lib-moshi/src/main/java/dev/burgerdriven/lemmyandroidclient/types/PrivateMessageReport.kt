package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PrivateMessageReport(
  public val id: PrivateMessageReportId,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "private_message_id")
  public val privateMessageId: PrivateMessageId,
  @Json(name = "original_pm_text")
  public val originalPmText: String,
  public val reason: String,
  public val resolved: Boolean,
  @Json(name = "resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
