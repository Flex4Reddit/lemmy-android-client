package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class DeleteCustomEmoji(
  public val id: CustomEmojiId,
  public val auth: String,
) : Parcelable
