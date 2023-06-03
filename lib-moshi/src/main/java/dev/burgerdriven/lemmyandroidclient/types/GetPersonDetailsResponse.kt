package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetPersonDetailsResponse(
  @Json(name = "person_view")
  public val personView: PersonView,
  public val comments: List<CommentView>,
  public val posts: List<PostView>,
  public val moderates: List<CommunityModeratorView>,
) : Parcelable
