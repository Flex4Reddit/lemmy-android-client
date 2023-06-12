package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetModlog(
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId?,
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("type_")
  public val type: ModlogActionType?,
  @SerializedName("other_person_id")
  public val otherPersonId: PersonId?,
  public val auth: String?,
) : Parcelable
