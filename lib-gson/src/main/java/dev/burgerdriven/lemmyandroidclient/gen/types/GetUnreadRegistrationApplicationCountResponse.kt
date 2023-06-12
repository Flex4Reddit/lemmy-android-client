package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetUnreadRegistrationApplicationCountResponse(
  @SerializedName("registration_applications")
  public val registrationApplications: Long,
) : Parcelable
