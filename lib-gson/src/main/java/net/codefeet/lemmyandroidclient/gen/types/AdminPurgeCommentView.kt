package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgeCommentView(
  @SerializedName("admin_purge_comment")
  public val adminPurgeComment: AdminPurgeComment,
  public val admin: Person?,
  public val post: Post,
) : Parcelable
