package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgePost(
  public val id: Long,
  @SerializedName("admin_person_id")
  public val adminPersonId: PersonId,
  @SerializedName("community_id")
  public val communityId: CommunityId,
  public val reason: String?,
  @SerializedName("when_")
  public val `when`: String,
) : Parcelable
