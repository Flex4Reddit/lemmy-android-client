package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PostReport(
  public val id: PostReportId,
  @SerializedName("creator_id")
  public val creatorId: PersonId,
  @SerializedName("post_id")
  public val postId: PostId,
  @SerializedName("original_post_name")
  public val originalPostName: String,
  @SerializedName("original_post_url")
  public val originalPostUrl: String?,
  @SerializedName("original_post_body")
  public val originalPostBody: String?,
  public val reason: String,
  public val resolved: Boolean,
  @SerializedName("resolver_id")
  public val resolverId: PersonId?,
  public val published: String,
  public val updated: String?,
) : Parcelable
