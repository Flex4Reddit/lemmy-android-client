package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class MyUserInfo(
  @Json(name = "local_user_view")
  public val localUserView: LocalUserView,
  public val follows: List<CommunityFollowerView>,
  public val moderates: List<CommunityModeratorView>,
  @Json(name = "community_blocks")
  public val communityBlocks: List<CommunityBlockView>,
  @Json(name = "person_blocks")
  public val personBlocks: List<PersonBlockView>,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>,
) : Parcelable
