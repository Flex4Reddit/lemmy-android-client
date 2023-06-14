package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Language(
  public val id: LanguageId,
  public val code: String,
  public val name: String,
) : Parcelable
