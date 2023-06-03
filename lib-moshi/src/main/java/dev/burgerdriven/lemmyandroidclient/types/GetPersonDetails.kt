package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetPersonDetails(
  @Json(name = "person_id")
  public val personId: PersonId?,
  public val username: String?,
  public val sort: SortType?,
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "saved_only")
  public val savedOnly: Boolean?,
  public val auth: String?,
) : Parcelable
