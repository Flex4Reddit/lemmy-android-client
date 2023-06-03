package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModRemoveCommentView(
  @Json(name = "mod_remove_comment")
  public val modRemoveComment: ModRemoveComment,
  public val moderator: Person?,
  public val comment: Comment,
  public val commenter: Person,
  public val post: Post,
  public val community: Community,
) : Parcelable
