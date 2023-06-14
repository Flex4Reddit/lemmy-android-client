package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModFeaturePostView(
  @SerializedName("mod_feature_post")
  public val modFeaturePost: ModFeaturePost,
  public val moderator: Person?,
  public val post: Post,
  public val community: Community,
) : Parcelable
