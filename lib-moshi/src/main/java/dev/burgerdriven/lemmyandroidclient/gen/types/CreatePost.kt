package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreatePost(
  public val name: String,
  @Json(name = "community_id")
  public val communityId: CommunityId,
  public val url: String?,
  public val body: String?,
  public val honeypot: String?,
  public val nsfw: Boolean?,
  @Json(name = "language_id")
  public val languageId: LanguageId?,
  public val auth: String,
) : Parcelable
