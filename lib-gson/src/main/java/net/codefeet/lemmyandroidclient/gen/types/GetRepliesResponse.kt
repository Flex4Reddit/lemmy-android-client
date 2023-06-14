package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetRepliesResponse(
  public val replies: List<CommentReplyView>,
) : Parcelable
