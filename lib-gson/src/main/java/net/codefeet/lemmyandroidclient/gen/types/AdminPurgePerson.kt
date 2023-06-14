package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgePerson(
  public val id: Long,
  @SerializedName("admin_person_id")
  public val adminPersonId: PersonId,
  public val reason: String?,
  @SerializedName("when_")
  public val `when`: String,
) : Parcelable
