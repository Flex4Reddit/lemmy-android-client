package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class EditPost(
  @SerializedName("post_id")
  public val postId: PostId,
  public val name: String?,
  public val url: String?,
  public val body: String?,
  public val nsfw: Boolean?,
  @SerializedName("language_id")
  public val languageId: LanguageId?,
  public val auth: String,
) : Parcelable
