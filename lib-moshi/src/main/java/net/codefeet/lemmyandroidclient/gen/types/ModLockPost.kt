package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class ModLockPost(
  public val id: Long,
  @Json(name = "mod_person_id")
  public val modPersonId: PersonId,
  @Json(name = "post_id")
  public val postId: PostId,
  public val locked: Boolean,
  @Json(name = "when_")
  public val `when`: String,
) : Parcelable
