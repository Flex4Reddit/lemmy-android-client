package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModAddCommunityView(
  @SerializedName("mod_add_community")
  public val modAddCommunity: ModAddCommunity,
  public val moderator: Person?,
  public val community: Community,
  @SerializedName("modded_person")
  public val moddedPerson: Person,
) : Parcelable
