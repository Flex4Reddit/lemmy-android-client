package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AddAdminResponse(
  public val admins: List<PersonView>,
) : Parcelable
