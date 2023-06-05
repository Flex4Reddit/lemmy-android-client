package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class FederatedInstances(
  public val linked: List<Instance>,
  public val allowed: List<Instance>,
  public val blocked: List<Instance>,
) : Parcelable
