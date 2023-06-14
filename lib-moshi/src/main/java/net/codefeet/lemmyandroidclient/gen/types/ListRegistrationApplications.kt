package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ListRegistrationApplications(
  @Json(name = "unread_only")
  public val unreadOnly: Boolean?,
  public val page: Long?,
  public val limit: Long?,
  public val auth: String,
) : Parcelable
