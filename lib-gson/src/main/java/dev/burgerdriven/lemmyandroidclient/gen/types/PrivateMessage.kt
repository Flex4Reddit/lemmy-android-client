package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PrivateMessage(
  public val id: PrivateMessageId,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("recipient_id")
  public val recipientId: PersonId,
  public val content: String,
  public val deleted: Boolean,
  public val read: Boolean,
  public val published: String,
  public val updated: String?,
  @SerializedName("ap_id")
  public val apId: String,
  public val local: Boolean,
) : Parcelable
