package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreatePostLike(
  @Json(name = "post_id")
  public val postId: PostId,
  public val score: Long,
  public val auth: String,
) : Parcelable
