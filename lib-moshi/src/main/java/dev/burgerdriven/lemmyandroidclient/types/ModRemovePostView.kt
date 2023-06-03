package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModRemovePostView(
  @Json(name = "mod_remove_post")
  public val modRemovePost: ModRemovePost,
  public val moderator: Person?,
  public val post: Post,
  public val community: Community,
) : Parcelable
