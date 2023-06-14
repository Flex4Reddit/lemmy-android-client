package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Comment(
  public val id: CommentId,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "post_id")
  public val postId: PostId,
  public val content: String,
  public val removed: Boolean,
  public val published: String,
  public val updated: String?,
  public val deleted: Boolean,
  @Json(name = "ap_id")
  public val apId: String,
  public val local: Boolean,
  public val path: String,
  public val distinguished: Boolean,
  @Json(name = "language_id")
  public val languageId: LanguageId,
) : Parcelable
