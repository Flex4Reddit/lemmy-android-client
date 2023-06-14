package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetCommunityResponse(
  @Json(name = "community_view")
  public val communityView: CommunityView,
  public val site: Site?,
  public val moderators: List<CommunityModeratorView>,
  public val online: Long,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>,
  @Json(name = "default_post_language")
  public val defaultPostLanguage: LanguageId?,
) : Parcelable
