package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class LocalSiteRateLimit(
  public val id: Long,
  @SerializedName("local_site_id")
  public val localSiteId: LocalSiteId,
  public val message: Long,
  @SerializedName("message_per_second")
  public val messagePerSecond: Long,
  public val post: Long,
  @SerializedName("post_per_second")
  public val postPerSecond: Long,
  public val register: Long,
  @SerializedName("register_per_second")
  public val registerPerSecond: Long,
  public val image: Long,
  @SerializedName("image_per_second")
  public val imagePerSecond: Long,
  public val comment: Long,
  @SerializedName("comment_per_second")
  public val commentPerSecond: Long,
  public val search: Long,
  @SerializedName("search_per_second")
  public val searchPerSecond: Long,
  public val published: String,
  public val updated: String?,
) : Parcelable
