package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class MarkPersonMentionAsRead(
  @SerializedName("person_mention_id")
  public val personMentionId: PersonMentionId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
