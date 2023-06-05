package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class LocalUserView(
  @Json(name = "local_user")
  public val localUser: LocalUser,
  public val person: Person,
  public val counts: PersonAggregates,
) : Parcelable
