package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ListRegistrationApplicationsResponse(
  @Json(name = "registration_applications")
  public val registrationApplications: List<RegistrationApplicationView>,
) : Parcelable
