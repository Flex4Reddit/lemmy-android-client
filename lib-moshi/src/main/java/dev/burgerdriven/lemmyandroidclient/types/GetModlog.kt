package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetModlog(
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId?,
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "type_")
  public val type: ModlogActionType?,
  @Json(name = "other_person_id")
  public val otherPersonId: PersonId?,
  public val auth: String?,
) : Parcelable
