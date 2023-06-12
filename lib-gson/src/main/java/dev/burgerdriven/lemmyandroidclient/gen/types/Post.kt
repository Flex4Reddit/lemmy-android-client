package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Post(
  public val id: PostId,
  public val name: String,
  public val url: String?,
  public val body: String?,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val removed: Boolean,
  public val locked: Boolean,
  public val published: String,
  public val updated: String?,
  public val deleted: Boolean,
  public val nsfw: Boolean,
  @SerializedName("embed_title")
  public val embedTitle: String?,
  @SerializedName("embed_description")
  public val embedDescription: String?,
  @SerializedName("thumbnail_url")
  public val thumbnailUrl: String?,
  @SerializedName("ap_id")
  public val apId: String,
  public val local: Boolean,
  @SerializedName("embed_video_url")
  public val embedVideoUrl: String?,
  @SerializedName("language_id")
  public val languageId: LanguageId,
  @SerializedName("featured_community")
  public val featuredCommunity: Boolean,
  @SerializedName("featured_local")
  public val featuredLocal: Boolean,
) : Parcelable
