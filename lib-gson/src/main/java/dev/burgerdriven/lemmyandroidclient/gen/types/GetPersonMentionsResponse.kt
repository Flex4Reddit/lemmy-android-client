package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetPersonMentionsResponse(
  public val mentions: List<PersonMentionView>,
) : Parcelable
