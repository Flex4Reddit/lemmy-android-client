package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetFederatedInstancesResponse(
  @Json(name = "federated_instances")
  public val federatedInstances: FederatedInstances?,
) : Parcelable
