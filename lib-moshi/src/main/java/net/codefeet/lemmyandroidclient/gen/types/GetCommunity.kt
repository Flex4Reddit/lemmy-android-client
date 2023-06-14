package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetCommunity(
  public val id: CommunityId?,
  public val name: String?,
  public val auth: String?,
) : Parcelable
