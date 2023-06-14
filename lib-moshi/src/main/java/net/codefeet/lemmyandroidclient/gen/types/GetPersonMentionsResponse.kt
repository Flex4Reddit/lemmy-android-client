package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetPersonMentionsResponse(
  public val mentions: List<PersonMentionView>,
) : Parcelable
