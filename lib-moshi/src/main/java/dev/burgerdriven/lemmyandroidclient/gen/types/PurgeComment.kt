package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PurgeComment(
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val reason: String?,
  public val auth: String,
) : Parcelable
