package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ModLockPostView(
  @SerializedName("mod_lock_post")
  public val modLockPost: ModLockPost,
  public val moderator: Person?,
  public val post: Post,
  public val community: Community,
) : Parcelable
