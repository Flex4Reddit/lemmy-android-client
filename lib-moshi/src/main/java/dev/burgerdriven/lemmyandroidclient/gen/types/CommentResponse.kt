package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class CommentResponse(
  @Json(name = "comment_view")
  public val commentView: CommentView,
  @Json(name = "recipient_ids")
  public val recipientIds: List<LocalUserId>,
  @Json(name = "form_id")
  public val formId: String?,
) : Parcelable
