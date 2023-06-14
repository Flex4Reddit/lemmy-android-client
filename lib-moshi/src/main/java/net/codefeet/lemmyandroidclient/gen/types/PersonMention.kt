package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PersonMention(
  public val id: PersonMentionId,
  @Json(name = "recipient_id")
  public val recipientId: PersonId,
  @Json(name = "comment_id")
  public val commentId: CommentId,
  public val read: Boolean,
  public val published: String,
) : Parcelable
