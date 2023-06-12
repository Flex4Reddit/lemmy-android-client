package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PersonBlockView(
  public val person: Person,
  public val target: Person,
) : Parcelable
