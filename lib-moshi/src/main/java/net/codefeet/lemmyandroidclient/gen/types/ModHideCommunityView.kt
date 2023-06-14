package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModHideCommunityView(
  @Json(name = "mod_hide_community")
  public val modHideCommunity: ModHideCommunity,
  public val admin: Person?,
  public val community: Community,
) : Parcelable
