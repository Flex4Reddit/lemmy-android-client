package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
public data class DeleteCustomEmojiResponse(
  public val id: CustomEmojiId,
  public val success: Boolean,
) : Parcelable
