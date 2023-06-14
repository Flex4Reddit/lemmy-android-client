package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModTransferCommunityView(
  @SerializedName("mod_transfer_community")
  public val modTransferCommunity: ModTransferCommunity,
  public val moderator: Person?,
  public val community: Community,
  @SerializedName("modded_person")
  public val moddedPerson: Person,
) : Parcelable
