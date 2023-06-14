package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CustomEmojiResponse(
  @SerializedName("custom_emoji")
  public val customEmoji: CustomEmojiView,
) : Parcelable
