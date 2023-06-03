package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class BanPersonResponse(
  @Json(name = "person_view")
  public val personView: PersonView,
  public val banned: Boolean,
) : Parcelable
