package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Tagline(
  public val id: Long,
  @SerializedName("local_site_id")
  public val localSiteId: LocalSiteId,
  public val content: String,
  public val published: String,
  public val updated: String?,
) : Parcelable
