package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class BlockPersonResponse(
  @Json(name = "person_view")
  public val personView: PersonView,
  public val blocked: Boolean,
) : Parcelable
