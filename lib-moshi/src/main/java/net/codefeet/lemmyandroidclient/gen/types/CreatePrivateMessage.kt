package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreatePrivateMessage(
  public val content: String,
  @Json(name = "recipient_id")
  public val recipientId: PersonId,
  public val auth: String,
) : Parcelable
