package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AdminPurgeCommunityView(
  @Json(name = "admin_purge_community")
  public val adminPurgeCommunity: AdminPurgeCommunity,
  public val admin: Person?,
) : Parcelable
