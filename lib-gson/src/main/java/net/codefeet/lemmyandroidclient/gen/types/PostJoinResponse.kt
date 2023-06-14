package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostJoinResponse(
  public val joined: Boolean,
) : Parcelable
