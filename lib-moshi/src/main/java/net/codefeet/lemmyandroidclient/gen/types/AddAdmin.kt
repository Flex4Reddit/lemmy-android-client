package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AddAdmin(
  @Json(name = "person_id")
  public val personId: PersonId,
  public val added: Boolean,
  public val auth: String,
) : Parcelable
