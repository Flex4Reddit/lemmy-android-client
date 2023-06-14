package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PurgePerson(
  @SerializedName("person_id")
  public val personId: PersonId,
  public val reason: String?,
  public val auth: String,
) : Parcelable
