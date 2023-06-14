package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModTransferCommunity(
  public val id: Long,
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId,
  @SerializedName("other_person_id")
  public val otherPersonId: PersonId,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  @SerializedName("when_")
  public val `when`: String,
) : Parcelable
