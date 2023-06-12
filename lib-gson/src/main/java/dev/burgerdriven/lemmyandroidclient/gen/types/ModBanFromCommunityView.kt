package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModBanFromCommunityView(
  @SerializedName("mod_ban_from_community")
  public val modBanFromCommunity: ModBanFromCommunity,
  public val moderator: Person?,
  public val community: Community,
  @SerializedName("banned_person")
  public val bannedPerson: Person,
) : Parcelable
