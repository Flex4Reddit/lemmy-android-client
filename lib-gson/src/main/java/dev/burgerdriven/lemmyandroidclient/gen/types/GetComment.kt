package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetComment(
  public val id: CommentId,
  public val auth: String?,
) : Parcelable
