package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModRemoveCommunity(
  public val id: Long,
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val reason: String?,
  public val removed: Boolean,
  public val expires: String?,
  @SerializedName("when_")
  public val `when`: String,
) : Parcelable
