package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PostReport(
  public val id: PostReportId,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "post_id")
  public val postId: PostId,
  @Json(name = "original_post_name")
  public val originalPostName: String,
  @Json(name = "original_post_url")
  public val originalPostUrl: String?,
  @Json(name = "original_post_body")
  public val originalPostBody: String?,
  public val reason: String,
  public val resolved: Boolean,
  @Json(name = "resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
