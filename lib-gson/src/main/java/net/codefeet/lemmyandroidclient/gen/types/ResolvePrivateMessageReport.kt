package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.Boolean
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
public data class ResolvePrivateMessageReport(
  @SerializedName("report_id")
  public val reportId: PrivateMessageReportId,
  public val resolved: Boolean,
  public val auth: String,
) : Parcelable
