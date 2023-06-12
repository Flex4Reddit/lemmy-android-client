package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreateCommunity(
  public val name: String,
  public val title: String,
  public val description: String?,
  public val icon: String?,
  public val banner: String?,
  public val nsfw: Boolean?,
  @SerializedName("posting_restricted_to_mods")
  public val postingRestrictedToMods: Boolean?,
  @SerializedName("discussion_languages")
  public val discussionLanguages: List<LanguageId>?,
  public val auth: String,
) : Parcelable
