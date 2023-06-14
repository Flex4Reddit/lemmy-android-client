package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ResolveObjectResponse(
  public val comment: CommentView?,
  public val post: PostView?,
  public val community: CommunityView?,
  public val person: PersonView?,
) : Parcelable
