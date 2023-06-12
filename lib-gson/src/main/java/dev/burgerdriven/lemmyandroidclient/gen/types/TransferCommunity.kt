package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class TransferCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  @SerializedName("person_id")
  public val personId: PersonId,
  public val auth: String,
) : Parcelable
