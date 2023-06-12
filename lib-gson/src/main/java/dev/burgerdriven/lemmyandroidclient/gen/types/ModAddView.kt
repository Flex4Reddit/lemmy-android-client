package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModAddView(
  @SerializedName("mod_add")
  public val modAdd: ModAdd,
  public val moderator: Person?,
  @SerializedName("modded_person")
  public val moddedPerson: Person,
) : Parcelable
