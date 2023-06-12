package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class RegistrationApplicationView(
  @SerializedName("registration_application")
  public val registrationApplication: RegistrationApplication,
  @SerializedName("creator_local_user")
  public val creatorLocalUser: LocalUser,
  public val creator: Person,
  public val admin: Person?,
) : Parcelable
