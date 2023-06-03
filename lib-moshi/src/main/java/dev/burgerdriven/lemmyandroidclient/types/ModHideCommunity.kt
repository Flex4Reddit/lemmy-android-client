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
public data class ModHideCommunity(
  public val id: Long,
  @Json(name = "community_id")
  public val communityId: CommunityId,
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId,
  @Json(name = "when_")
  public val `when`: String,
  public val reason: String?,
  public val hidden: Boolean,
) : Parcelable
