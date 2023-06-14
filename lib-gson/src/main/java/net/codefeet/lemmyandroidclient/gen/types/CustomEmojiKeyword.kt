package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CustomEmojiKeyword(
  public val id: Long,
  @SerializedName("custom_emoji_id")
  public val customEmojiId: CustomEmojiId,
  public val keyword: String,
) : Parcelable
