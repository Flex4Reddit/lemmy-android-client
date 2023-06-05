package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModFeaturePostView(
  @Json(name = "mod_feature_post")
  public val modFeaturePost: ModFeaturePost,
  public val moderator: Person?,
  public val post: Post,
  public val community: Community,
) : Parcelable
