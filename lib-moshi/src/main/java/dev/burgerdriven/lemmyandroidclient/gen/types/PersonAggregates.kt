package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Long
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PersonAggregates(
  public val id: Long,
  @Json(name = "person_id")
  public val personId: PersonId,
  @Json(name = "post_count")
  public val postCount: Long,
  @Json(name = "post_score")
  public val postScore: Long,
  @Json(name = "comment_count")
  public val commentCount: Long,
  @Json(name = "comment_score")
  public val commentScore: Long,
) : Parcelable
