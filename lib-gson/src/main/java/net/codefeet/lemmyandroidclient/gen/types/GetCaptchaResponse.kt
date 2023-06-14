package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetCaptchaResponse(
  public val ok: CaptchaResponse?,
) : Parcelable
