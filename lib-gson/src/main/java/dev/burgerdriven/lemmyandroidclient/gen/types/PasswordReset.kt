package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class PasswordReset(
  public val email: String,
) : Parcelable
