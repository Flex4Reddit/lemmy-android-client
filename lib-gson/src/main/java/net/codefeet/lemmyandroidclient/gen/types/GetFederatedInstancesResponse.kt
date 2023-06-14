package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetFederatedInstancesResponse(
  @SerializedName("federated_instances")
  public val federatedInstances: FederatedInstances?,
) : Parcelable
