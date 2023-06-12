package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreateComment(
  public val content: String,
  @SerializedName("post_id")
  public val postId: PostId,
  @SerializedName("parent_id")
  public val parentId: CommentId?,
  @SerializedName("language_id")
  public val languageId: LanguageId?,
  @SerializedName("form_id")
  public val formId: String?,
  public val auth: String,
) : Parcelable
