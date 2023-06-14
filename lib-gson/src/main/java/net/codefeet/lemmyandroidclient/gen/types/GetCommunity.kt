package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetCommunity(
  public val id: CommunityId?,
  public val name: String?,
  public val auth: String?,
) : Parcelable
