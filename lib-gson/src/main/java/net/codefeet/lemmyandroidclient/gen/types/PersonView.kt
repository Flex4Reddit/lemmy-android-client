package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PersonView(
  public val person: Person,
  public val counts: PersonAggregates,
) : Parcelable
