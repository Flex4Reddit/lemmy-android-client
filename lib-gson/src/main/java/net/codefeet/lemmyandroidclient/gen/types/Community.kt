package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Community(
  public val id: CommunityId,
  public val name: String,
  public val title: String,
  public val description: String?,
  public val removed: Boolean,
  public val published: String,
  public val updated: String?,
  public val deleted: Boolean,
  public val nsfw: Boolean,
  @SerializedName("actor_id")
  public val actorId: String,
  public val local: Boolean,
  public val icon: String?,
  public val banner: String?,
  public val hidden: Boolean,
  @SerializedName("posting_restricted_to_mods")
  public val postingRestrictedToMods: Boolean,
  @SerializedName("instance_id")
  public val instanceId: InstanceId,
) : Parcelable
