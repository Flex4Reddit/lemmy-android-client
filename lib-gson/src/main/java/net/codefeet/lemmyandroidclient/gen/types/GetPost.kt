package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPost(
  public val id: PostId?,
  @SerializedName("comment_id")
  public val commentId: CommentId?,
  public val auth: String?,
) : Parcelable
