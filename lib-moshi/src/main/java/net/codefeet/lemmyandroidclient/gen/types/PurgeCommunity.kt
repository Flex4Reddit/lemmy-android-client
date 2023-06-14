package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PurgeCommunity(
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val reason: String?,
  public val auth: String,
) : Parcelable
