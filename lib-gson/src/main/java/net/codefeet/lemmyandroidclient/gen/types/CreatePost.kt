package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreatePost(
  public val name: String,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val url: String?,
  public val body: String?,
  public val honeypot: String?,
  public val nsfw: Boolean?,
  @SerializedName("language_id")
  public val languageId: LanguageId?,
  public val auth: String,
) : Parcelable
