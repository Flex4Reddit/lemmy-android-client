package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModRemoveCommunityView(
  @Json(name = "mod_remove_community")
  public val modRemoveCommunity: ModRemoveCommunity,
  public val moderator: Person?,
  public val community: Community,
) : Parcelable
