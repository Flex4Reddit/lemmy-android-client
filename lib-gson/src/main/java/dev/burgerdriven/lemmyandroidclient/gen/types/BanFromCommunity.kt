package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class BanFromCommunity(
  @SerializedName("community_id")
  public val communityId: CommunityId,
  @SerializedName("person_id")
  public val personId: PersonId,
  public val ban: Boolean,
  @SerializedName("remove_data")
  public val removeData: Boolean?,
  public val reason: String?,
  public val expires: Long?,
  public val auth: String,
) : Parcelable
