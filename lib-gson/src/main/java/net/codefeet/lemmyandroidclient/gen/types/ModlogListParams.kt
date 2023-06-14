package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModlogListParams(
  @SerializedName("community_id")
  public val communityId: CommunityId?,
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId?,
  @SerializedName("other_person_id")
  public val otherPersonId: PersonId?,
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("hide_modlog_names")
  public val hideModlogNames: Boolean,
) : Parcelable
