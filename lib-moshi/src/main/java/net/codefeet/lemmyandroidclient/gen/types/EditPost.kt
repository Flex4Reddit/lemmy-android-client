package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class EditPost(
  @Json(name = "post_id")
  public val postId: PostId,
  public val name: String?,
  public val url: String?,
  public val body: String?,
  public val nsfw: Boolean?,
  @Json(name = "language_id")
  public val languageId: LanguageId?,
  public val auth: String,
) : Parcelable
