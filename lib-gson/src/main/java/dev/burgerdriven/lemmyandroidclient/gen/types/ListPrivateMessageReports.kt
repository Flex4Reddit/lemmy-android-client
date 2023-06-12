package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ListPrivateMessageReports(
  public val page: Long?,
  public val limit: Long?,
  @SerializedName("unresolved_only")
  public val unresolvedOnly: Boolean?,
  public val auth: String,
) : Parcelable
