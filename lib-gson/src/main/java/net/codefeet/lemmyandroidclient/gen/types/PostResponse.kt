package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostResponse(
  @SerializedName("post_view")
  public val postView: PostView,
) : Parcelable
