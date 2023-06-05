package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModBanView(
  @Json(name = "mod_ban")
  public val modBan: ModBan,
  public val moderator: Person?,
  @Json(name = "banned_person")
  public val bannedPerson: Person,
) : Parcelable
