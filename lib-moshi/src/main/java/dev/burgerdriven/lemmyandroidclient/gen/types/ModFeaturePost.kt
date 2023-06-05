package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModFeaturePost(
  public val id: Long,
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId,
  @Json(name = "post_id")
  public val postId: PostId,
  public val featured: Boolean,
  @Json(name = "when_")
  public val `when`: String,
  @Json(name = "is_featured_community")
  public val isFeaturedCommunity: Boolean,
) : Parcelable
