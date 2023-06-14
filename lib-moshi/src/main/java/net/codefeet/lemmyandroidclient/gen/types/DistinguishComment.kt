package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class DistinguishComment(
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val distinguished: Boolean,
  public val auth: String,
) : Parcelable
