package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModBanFromCommunityView(
  @Json(name = "mod_ban_from_community")
  public val modBanFromCommunity: ModBanFromCommunity,
  public val moderator: Person?,
  public val community: Community,
  @Json(name = "banned_person")
  public val bannedPerson: Person,
) : Parcelable
