package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class VerifyEmail(
  public val token: String,
) : Parcelable
