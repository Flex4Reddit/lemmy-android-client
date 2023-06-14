package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class RegistrationApplicationView(
  @Json(name = "registration_application")
  public val registrationApplication: RegistrationApplication,
  @Json(name = "creator_local_user")
  public val creatorLocalUser: LocalUser,
  public val creator: Person,
  public val admin: Person?,
) : Parcelable
