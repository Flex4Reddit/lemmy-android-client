package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommunityResponse(
  @SerializedName("community_view")
  public val communityView: CommunityView,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>,
) : Parcelable
