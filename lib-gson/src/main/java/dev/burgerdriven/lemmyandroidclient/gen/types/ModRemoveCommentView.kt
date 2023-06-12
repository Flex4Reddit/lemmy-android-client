package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModRemoveCommentView(
  @SerializedName("mod_remove_comment")
  public val modRemoveComment: ModRemoveComment,
  public val moderator: Person?,
  public val comment: Comment,
  public val commenter: Person,
  public val post: Post,
  public val community: Community,
) : Parcelable
