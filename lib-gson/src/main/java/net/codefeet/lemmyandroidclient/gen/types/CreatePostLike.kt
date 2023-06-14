package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CreatePostLike(
  @SerializedName("post_id")
  public val postId: PostId,
  public val score: Long,
  public val auth: String,
) : Parcelable
