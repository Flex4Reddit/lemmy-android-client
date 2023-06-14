package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class MyUserInfo(
  @SerializedName("local_user_view")
  public val localUserView: LocalUserView,
  public val follows: List<CommunityFollowerView>,
  public val moderates: List<CommunityModeratorView>,
  @SerializedName("community_blocks")
  public val communityBlocks: List<CommunityBlockView>,
  @SerializedName("person_blocks")
  public val personBlocks: List<PersonBlockView>,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>,
) : Parcelable
