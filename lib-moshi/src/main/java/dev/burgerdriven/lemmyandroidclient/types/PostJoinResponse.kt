package dev.burgerdriven.lemmyandroidclient.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PostJoinResponse(
  public val joined: Boolean,
) : Parcelable
