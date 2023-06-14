package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModTransferCommunity(
  public val id: Long,
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId,
  @Json(name = "other_person_id")
  public val otherPersonId: PersonId,
  @Json(name = "community_id")
  public val communityId: CommunityId,
  @Json(name = "when_")
  public val `when`: String,
) : Parcelable
