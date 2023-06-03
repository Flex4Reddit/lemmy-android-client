package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PersonMentionResponse(
  @Json(name = "person_mention_view")
  public val personMentionView: PersonMentionView,
) : Parcelable
