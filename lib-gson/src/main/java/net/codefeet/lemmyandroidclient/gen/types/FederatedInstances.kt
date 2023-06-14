package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class FederatedInstances(
  public val linked: List<Instance>,
  public val allowed: List<Instance>,
  public val blocked: List<Instance>,
) : Parcelable
