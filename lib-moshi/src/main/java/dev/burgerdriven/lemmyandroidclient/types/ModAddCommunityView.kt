package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModAddCommunityView(
  @Json(name = "mod_add_community")
  public val modAddCommunity: ModAddCommunity,
  public val moderator: Person?,
  public val community: Community,
  @Json(name = "modded_person")
  public val moddedPerson: Person,
) : Parcelable
