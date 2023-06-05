package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ListPrivateMessageReports(
  public val page: Long?,
  public val limit: Long?,
  @Json(name = "unresolved_only")
  public val unresolvedOnly: Boolean?,
  public val auth: String,
) : Parcelable
