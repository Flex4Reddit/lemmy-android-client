package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Comment(
  public val id: CommentId,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("post_id")
  public val postId: PostId,
  public val content: String,
  public val removed: Boolean,
  public val published: String,
  public val updated: String?,
  public val deleted: Boolean,
  @SerializedName("ap_id")
  public val apId: String,
  public val local: Boolean,
  public val path: String,
  public val distinguished: Boolean,
  @SerializedName("language_id")
  public val languageId: LanguageId,
) : Parcelable
