package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetCommunityResponse(
  @SerializedName("community_view")
  public val communityView: CommunityView,
  public val site: Site?,
  public val moderators: List<CommunityModeratorView>,
  public val online: Long,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>,
  @SerializedName("default_post_language")
  public val defaultPostLanguage: LanguageId?,
) : Parcelable
