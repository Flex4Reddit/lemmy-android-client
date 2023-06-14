package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PersonMentionResponse(
  @SerializedName("person_mention_view")
  public val personMentionView: PersonMentionView,
) : Parcelable
