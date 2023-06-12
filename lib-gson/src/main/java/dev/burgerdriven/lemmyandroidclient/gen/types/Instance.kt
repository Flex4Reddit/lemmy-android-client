package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Instance(
  public val id: InstanceId,
  public val domain: String,
  public val published: String,
  public val updated: String?,
  public val software: String?,
  public val version: String?,
) : Parcelable
