package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModRemovePostView(
  @SerializedName("mod_remove_post")
  public val modRemovePost: ModRemovePost,
  public val moderator: Person?,
  public val post: Post,
  public val community: Community,
) : Parcelable
