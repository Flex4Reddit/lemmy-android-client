package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPersonMentions(
  public val sort: CommentSortType?,
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("unread_only")
  public val unreadOnly: Boolean?,
  public val auth: String,
) : Parcelable
