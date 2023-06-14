package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostJoin(
  @SerializedName("post_id")
  public val postId: PostId,
) : Parcelable
