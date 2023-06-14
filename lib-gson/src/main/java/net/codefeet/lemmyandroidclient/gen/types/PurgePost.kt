package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PurgePost(
  @SerializedName("post_id")
  public val postId: PostId,
  public val reason: String?,
  public val auth: String,
) : Parcelable
