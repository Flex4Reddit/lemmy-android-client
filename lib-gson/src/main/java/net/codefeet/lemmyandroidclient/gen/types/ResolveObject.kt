package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ResolveObject(
  public val q: String,
  public val auth: String,
) : Parcelable
