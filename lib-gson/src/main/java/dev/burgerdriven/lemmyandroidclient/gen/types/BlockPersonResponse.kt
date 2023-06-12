package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
public data class BlockPersonResponse(
  @SerializedName("person_view")
  public val personView: PersonView,
  public val blocked: Boolean,
) : Parcelable
