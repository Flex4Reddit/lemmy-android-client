package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPersonDetailsResponse(
  @SerializedName("person_view")
  public val personView: PersonView,
  public val comments: List<CommentView>,
  public val posts: List<PostView>,
  public val moderates: List<CommunityModeratorView>,
) : Parcelable
