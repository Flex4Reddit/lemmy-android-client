package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class BanFromCommunity(
  @Json(name = "community_id")
  public val communityId: CommunityId,
  @Json(name = "person_id")
  public val personId: PersonId,
  public val ban: Boolean,
  @Json(name = "remove_data")
  public val removeData: Boolean?,
  public val reason: String?,
  public val expires: Long?,
  public val auth: String,
) : Parcelable
