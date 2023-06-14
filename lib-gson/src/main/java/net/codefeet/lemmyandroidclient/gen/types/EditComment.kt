package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class EditComment(
  @SerializedName("comment_id")
  public val commentId: CommentId,
  public val content: String?,
  @SerializedName("language_id")
  public val languageId: LanguageId?,
  @SerializedName("form_id")
  public val formId: String?,
  public val auth: String,
) : Parcelable
