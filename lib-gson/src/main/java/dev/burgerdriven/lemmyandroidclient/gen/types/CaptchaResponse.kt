package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class CaptchaResponse(
  public val png: String,
  public val wav: String,
  public val uuid: String,
) : Parcelable
