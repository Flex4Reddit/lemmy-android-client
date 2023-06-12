package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModHideCommunityView(
  @SerializedName("mod_hide_community")
  public val modHideCommunity: ModHideCommunity,
  public val admin: Person?,
  public val community: Community,
) : Parcelable
