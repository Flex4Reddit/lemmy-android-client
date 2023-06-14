package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class DeleteCommunity(
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val deleted: Boolean,
  public val auth: String,
) : Parcelable
