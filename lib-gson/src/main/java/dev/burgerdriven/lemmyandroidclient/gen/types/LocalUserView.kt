package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class LocalUserView(
  @SerializedName("local_user")
  public val localUser: LocalUser,
  public val person: Person,
  public val counts: PersonAggregates,
) : Parcelable
