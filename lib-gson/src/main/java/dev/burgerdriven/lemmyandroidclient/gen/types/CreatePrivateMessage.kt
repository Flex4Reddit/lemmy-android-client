package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreatePrivateMessage(
  public val content: String,
  @SerializedName("recipient_id")
  public val recipientId: PersonId,
  public val auth: String,
) : Parcelable
