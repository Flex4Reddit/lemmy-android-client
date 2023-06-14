package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LocalSiteRateLimit(
  public val id: Long,
  @Json(name = "local_site_id")
  public val localSiteId: LocalSiteId,
  public val message: Long,
  @Json(name = "message_per_second")
  public val messagePerSecond: Long,
  public val post: Long,
  @Json(name = "post_per_second")
  public val postPerSecond: Long,
  public val register: Long,
  @Json(name = "register_per_second")
  public val registerPerSecond: Long,
  public val image: Long,
  @Json(name = "image_per_second")
  public val imagePerSecond: Long,
  public val comment: Long,
  @Json(name = "comment_per_second")
  public val commentPerSecond: Long,
  public val search: Long,
  @Json(name = "search_per_second")
  public val searchPerSecond: Long,
  public val published: String,
  public val updated: String?,
) : Parcelable
