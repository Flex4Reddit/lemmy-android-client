package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModAddView(
  @Json(name = "mod_add")
  public val modAdd: ModAdd,
  public val moderator: Person?,
  @Json(name = "modded_person")
  public val moddedPerson: Person,
) : Parcelable
