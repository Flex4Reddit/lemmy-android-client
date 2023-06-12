package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModHideCommunity(
  public val id: Long,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId,
  @SerializedName("when_")
  public val `when`: String,
  public val reason: String?,
  public val hidden: Boolean,
) : Parcelable
