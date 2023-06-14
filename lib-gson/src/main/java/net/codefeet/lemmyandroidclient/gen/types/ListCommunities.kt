package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListCommunities(
  @SerializedName("type_")
  public val type: ListingType?,
  public val sort: SortType?,
  public val page: Long?,
  public val limit: Long?,
  public val auth: String?,
) : Parcelable
