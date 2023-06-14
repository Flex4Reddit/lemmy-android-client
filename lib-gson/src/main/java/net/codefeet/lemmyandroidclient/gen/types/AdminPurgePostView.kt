package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgePostView(
  @SerializedName("admin_purge_post")
  public val adminPurgePost: AdminPurgePost,
  public val admin: Person?,
  public val community: Community,
) : Parcelable
