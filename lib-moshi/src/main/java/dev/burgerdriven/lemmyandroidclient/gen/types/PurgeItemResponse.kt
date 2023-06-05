package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class PurgeItemResponse(
  public val success: Boolean,
) : Parcelable
