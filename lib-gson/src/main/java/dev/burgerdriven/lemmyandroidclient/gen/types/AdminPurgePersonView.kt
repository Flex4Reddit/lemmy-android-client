package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
public data class AdminPurgePersonView(
  @SerializedName("admin_purge_person")
  public val adminPurgePerson: AdminPurgePerson,
  public val admin: Person?,
) : Parcelable
