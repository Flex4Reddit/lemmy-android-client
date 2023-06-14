package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Person(
  public val id: PersonId,
  public val name: String,
  @SerializedName("display_name")
  public val displayName: String?,
  public val avatar: String?,
  public val banned: Boolean,
  public val published: String,
  public val updated: String?,
  @SerializedName("actor_id")
  public val actorId: String,
  public val bio: String?,
  public val local: Boolean,
  public val banner: String?,
  public val deleted: Boolean,
  @SerializedName("matrix_user_id")
  public val matrixUserId: String?,
  public val admin: Boolean,
  @SerializedName("bot_account")
  public val botAccount: Boolean,
  @SerializedName("ban_expires")
  public val banExpires: String?,
  @SerializedName("instance_id")
  public val instanceId: InstanceId,
) : Parcelable
