package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModAdd(
  public val id: Long,
  @SerializedName("mod_person_id")
  public val modPersonId: PersonId,
  @SerializedName("other_person_id")
  public val otherPersonId: PersonId,
  public val removed: Boolean,
  @SerializedName("when_")
  public val `when`: String,
) : Parcelable
