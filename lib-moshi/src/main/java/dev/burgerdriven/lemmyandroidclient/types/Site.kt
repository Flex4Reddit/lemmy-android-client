package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Site(
  public val id: SiteId,
  public val name: String,
  public val sidebar: String?,
  public val published: String,
  public val updated: String?,
  public val icon: String?,
  public val banner: String?,
  public val description: String?,
  @Json(name = "actor_id")
  public val actorId: String,
  @Json(name = "last_refreshed_at")
  public val lastRefreshedAt: String,
  @Json(name = "inbox_url")
  public val inboxUrl: String,
  @Json(name = "private_key")
  public val privateKey: String?,
  @Json(name = "public_key")
  public val publicKey: String,
  @Json(name = "instance_id")
  public val instanceId: InstanceId,
) : Parcelable
