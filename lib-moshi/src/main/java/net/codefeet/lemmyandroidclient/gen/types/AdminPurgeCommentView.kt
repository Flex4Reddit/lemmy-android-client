package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class AdminPurgeCommentView(
  @Json(name = "admin_purge_comment")
  public val adminPurgeComment: AdminPurgeComment,
  public val admin: Person?,
  public val post: Post,
) : Parcelable
