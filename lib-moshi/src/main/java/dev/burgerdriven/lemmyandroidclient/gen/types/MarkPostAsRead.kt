package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class MarkPostAsRead(
  @Json(name = "post_id")
  public val postId: PostId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
