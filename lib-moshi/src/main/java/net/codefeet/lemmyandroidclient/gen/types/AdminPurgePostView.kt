package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AdminPurgePostView(
  @Json(name = "admin_purge_post")
  public val adminPurgePost: AdminPurgePost,
  public val admin: Person?,
  public val community: Community,
) : Parcelable
