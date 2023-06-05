package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class BlockCommunityResponse(
  @Json(name = "community_view")
  public val communityView: CommunityView,
  public val blocked: Boolean,
) : Parcelable
