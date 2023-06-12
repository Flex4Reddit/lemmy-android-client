package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class RegistrationApplicationResponse(
  @SerializedName("registration_application")
  public val registrationApplication: RegistrationApplicationView,
) : Parcelable
