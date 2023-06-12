package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModRemoveCommunityView(
  @SerializedName("mod_remove_community")
  public val modRemoveCommunity: ModRemoveCommunity,
  public val moderator: Person?,
  public val community: Community,
) : Parcelable
