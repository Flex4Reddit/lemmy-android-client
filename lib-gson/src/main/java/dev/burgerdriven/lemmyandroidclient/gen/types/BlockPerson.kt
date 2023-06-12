package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class BlockPerson(
  @SerializedName("person_id")
  public val personId: PersonId,
  public val block: Boolean,
  public val auth: String,
) : Parcelable
