package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CustomEmojiView(
  @SerializedName("custom_emoji")
  public val customEmoji: CustomEmoji,
  public val keywords: List<CustomEmojiKeyword>,
) : Parcelable
