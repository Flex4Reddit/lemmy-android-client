package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PersonAggregates(
  public val id: Long,
  @SerializedName("person_id")
  public val personId: PersonId,
  @SerializedName("post_count")
  public val postCount: Long,
  @SerializedName("post_score")
  public val postScore: Long,
  @SerializedName("comment_count")
  public val commentCount: Long,
  @SerializedName("comment_score")
  public val commentScore: Long,
) : Parcelable
