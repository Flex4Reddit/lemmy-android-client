package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class SearchResponse(
  @Json(name = "type_")
  public val type: SearchType,
  public val comments: List<CommentView>,
  public val posts: List<PostView>,
  public val communities: List<CommunityView>,
  public val users: List<PersonView>,
) : Parcelable
