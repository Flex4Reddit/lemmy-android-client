package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreateComment(
  public val content: String,
  @Json(name = "post_id")
  public val postId: PostId,
  @Json(name = "parent_id")
  public val parentId: CommentId?,
  @Json(name = "language_id")
  public val languageId: LanguageId?,
  @Json(name = "form_id")
  public val formId: String?,
  public val auth: String,
) : Parcelable
