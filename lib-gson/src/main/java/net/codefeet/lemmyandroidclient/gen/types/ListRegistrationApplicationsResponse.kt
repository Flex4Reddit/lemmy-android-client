package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListRegistrationApplicationsResponse(
  @SerializedName("registration_applications")
  public val registrationApplications: List<RegistrationApplicationView>,
) : Parcelable
