package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessageReport(
  public val id: PrivateMessageReportId,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("private_message_id")
  public val privateMessageId: PrivateMessageId,
  @SerializedName("original_pm_text")
  public val originalPmText: String,
  public val reason: String,
  public val resolved: Boolean,
  @SerializedName("resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
