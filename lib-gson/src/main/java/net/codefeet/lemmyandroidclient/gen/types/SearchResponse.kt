package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class SearchResponse(
  @SerializedName("type_")
  public val type: SearchType,
  public val comments: List<CommentView>,
  public val posts: List<PostView>,
  public val communities: List<CommunityView>,
  public val users: List<PersonView>,
) : Parcelable
