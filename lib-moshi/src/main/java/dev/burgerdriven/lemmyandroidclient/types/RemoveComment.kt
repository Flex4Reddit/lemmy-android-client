package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class RemoveComment(
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val removed: Boolean,
  public val reason: String?,
  public val auth: String,
) : Parcelable
