package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Site(
  public val id: SiteId,
  public val name: String,
  public val sidebar: String?,
  public val published: String,
  public val updated: String?,
  public val icon: String?,
  public val banner: String?,
  public val description: String?,
  @SerializedName("actor_id")
  public val actorId: String,
  @SerializedName("last_refreshed_at")
  public val lastRefreshedAt: String,
  @SerializedName("inbox_url")
  public val inboxUrl: String,
  @SerializedName("private_key")
  public val privateKey: String?,
  @SerializedName("public_key")
  public val publicKey: String,
  @SerializedName("instance_id")
  public val instanceId: InstanceId,
) : Parcelable
