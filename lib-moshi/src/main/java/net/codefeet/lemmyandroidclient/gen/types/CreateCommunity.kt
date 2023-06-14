package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CreateCommunity(
  public val name: String,
  public val title: String,
  public val description: String?,
  public val icon: String?,
  public val banner: String?,
  public val nsfw: Boolean?,
  @Json(name = "posting_restricted_to_mods")
  public val postingRestrictedToMods: Boolean?,
  @Json(name = "discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  public val auth: String,
) : Parcelable
