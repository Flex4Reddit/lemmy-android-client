package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AdminPurgePersonView(
  @Json(name = "admin_purge_person")
  public val adminPurgePerson: AdminPurgePerson,
  public val admin: Person?,
) : Parcelable
