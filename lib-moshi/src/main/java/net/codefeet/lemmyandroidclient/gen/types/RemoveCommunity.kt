package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class RemoveCommunity(
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val removed: Boolean,
  public val reason: String?,
  public val expires: Long?,
  public val auth: String,
) : Parcelable
