package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModlogListParams(
  @Json(name = "community_id")
  public val communityId: CommunityId?,
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId?,
  @Json(name = "other_person_id")
  public val otherPersonId: PersonId?,
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "hide_modlog_names")
  public val hideModlogNames: Boolean,
) : Parcelable
