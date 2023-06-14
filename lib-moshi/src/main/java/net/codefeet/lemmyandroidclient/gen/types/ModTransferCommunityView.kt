package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModTransferCommunityView(
  @Json(name = "mod_transfer_community")
  public val modTransferCommunity: ModTransferCommunity,
  public val moderator: Person?,
  public val community: Community,
  @Json(name = "modded_person")
  public val moddedPerson: Person,
) : Parcelable
