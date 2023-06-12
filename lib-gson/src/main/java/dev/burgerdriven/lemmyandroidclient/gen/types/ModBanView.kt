package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModBanView(
  @SerializedName("mod_ban")
  public val modBan: ModBan,
  public val moderator: Person?,
  @SerializedName("banned_person")
  public val bannedPerson: Person,
) : Parcelable
