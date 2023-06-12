package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class RegistrationApplication(
  public val id: Long,
  @SerializedName("local_user_id")
  public val localUserId: LocalUserId,
  public val answer: String,
  @SerializedName("admin_id")
  public val adminId: PersonId?,
  @SerializedName("deny_reason")
  public val denyReason: String?,
  public val published: String,
) : Parcelable
