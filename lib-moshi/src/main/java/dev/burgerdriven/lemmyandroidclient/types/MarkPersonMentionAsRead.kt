package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class MarkPersonMentionAsRead(
  @Json(name = "person_mention_id")
  public val personMentionId: PersonMentionId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
