package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ApproveRegistrationApplication(
  public val id: Long,
  public val approve: Boolean,
  @SerializedName("deny_reason")
  public val denyReason: String?,
  public val auth: String,
) : Parcelable
