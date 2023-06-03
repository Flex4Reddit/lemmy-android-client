package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AdminPurgePerson(
  public val id: Long,
  @Json(name = "admin_person_id")
  public val adminPersonId: PersonId,
  public val reason: String?,
  @Json(name = "when_")
  public val `when`: String,
) : Parcelable
