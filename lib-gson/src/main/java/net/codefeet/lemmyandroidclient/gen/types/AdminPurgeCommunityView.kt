package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgeCommunityView(
  @SerializedName("admin_purge_community")
  public val adminPurgeCommunity: AdminPurgeCommunity,
  public val admin: Person?,
) : Parcelable
