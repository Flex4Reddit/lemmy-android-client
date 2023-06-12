package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class DeleteAccount(
  public val password: String,
  public val auth: String,
) : Parcelable
