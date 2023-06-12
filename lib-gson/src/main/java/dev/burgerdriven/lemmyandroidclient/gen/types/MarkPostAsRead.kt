package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class MarkPostAsRead(
  @SerializedName("post_id")
  public val postId: PostId,
  public val read: Boolean,
  public val auth: String,
) : Parcelable
