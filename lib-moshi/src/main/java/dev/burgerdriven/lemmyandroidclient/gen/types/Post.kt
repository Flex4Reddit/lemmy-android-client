package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Post(
  public val id: PostId,
  public val name: String,
  public val url: String?,
  public val body: String?,
  @Json(name = "creator_id")
  public val creatorId: PersonId,
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val removed: Boolean,
  public val locked: Boolean,
  public val published: String,
  public val updated: String?,
  public val deleted: Boolean,
  public val nsfw: Boolean,
  @Json(name = "embed_title")
  public val embedTitle: String?,
  @Json(name = "embed_description")
  public val embedDescription: String?,
  @Json(name = "thumbnail_url")
  public val thumbnailUrl: String?,
  @Json(name = "ap_id")
  public val apId: String,
  public val local: Boolean,
  @Json(name = "embed_video_url")
  public val embedVideoUrl: String?,
  @Json(name = "language_id")
  public val languageId: LanguageId,
  @Json(name = "featured_community")
  public val featuredCommunity: Boolean,
  @Json(name = "featured_local")
  public val featuredLocal: Boolean,
) : Parcelable
