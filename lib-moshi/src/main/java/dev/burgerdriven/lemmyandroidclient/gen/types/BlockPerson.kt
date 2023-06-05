package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class BlockPerson(
  @Json(name = "person_id")
  public val personId: PersonId,
  public val block: Boolean,
  public val auth: String,
) : Parcelable
