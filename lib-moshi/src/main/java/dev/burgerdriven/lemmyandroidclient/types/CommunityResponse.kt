package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommunityResponse(
  @Json(name = "community_view")
  public val communityView: CommunityView,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>,
) : Parcelable
