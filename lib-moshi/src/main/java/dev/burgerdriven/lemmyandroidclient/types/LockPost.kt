package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LockPost(
  @Json(name = "post_id")
  public val postId: PostId,
  public val locked: Boolean,
  public val auth: String,
) : Parcelable
