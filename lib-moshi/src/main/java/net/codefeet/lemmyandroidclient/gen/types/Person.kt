package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Person(
  public val id: PersonId,
  public val name: String,
  @Json(name = "display_name")
  public val displayName: String?,
  public val avatar: String?,
  public val banned: Boolean,
  public val published: String,
  public val updated: String?,
  @Json(name = "actor_id")
  public val actorId: String,
  public val bio: String?,
  public val local: Boolean,
  public val banner: String?,
  public val deleted: Boolean,
  @Json(name = "matrix_user_id")
  public val matrixUserId: String?,
  public val admin: Boolean,
  @Json(name = "bot_account")
  public val botAccount: Boolean,
  @Json(name = "ban_expires")
  public val banExpires: String?,
  @Json(name = "instance_id")
  public val instanceId: InstanceId,
) : Parcelable
