package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class Instance(
  public val id: InstanceId,
  public val domain: String,
  public val published: String,
  public val updated: String?,
  public val software: String?,
  public val version: String?,
) : Parcelable
