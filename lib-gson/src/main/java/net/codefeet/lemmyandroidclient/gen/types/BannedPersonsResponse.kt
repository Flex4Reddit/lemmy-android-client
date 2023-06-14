package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class BannedPersonsResponse(
  public val banned: List<PersonView>,
) : Parcelable
