package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CommentResponse(
  @SerializedName("comment_view")
  public val commentView: CommentView,
  @SerializedName("recipient_ids")
  public val recipientIds: List<LocalUserId>,
  @SerializedName("form_id")
  public val formId: String?,
) : Parcelable
