package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class RegistrationApplicationResponse(
  @Json(name = "registration_application")
  public val registrationApplication: RegistrationApplicationView,
) : Parcelable
