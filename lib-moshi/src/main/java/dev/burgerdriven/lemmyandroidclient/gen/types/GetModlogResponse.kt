package dev.burgerdriven.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
public data class GetModlogResponse(
  @Json(name = "removed_posts")
  public val removedPosts: List<ModRemovePostView>,
  @Json(name = "locked_posts")
  public val lockedPosts: List<ModLockPostView>,
  @Json(name = "featured_posts")
  public val featuredPosts: List<ModFeaturePostView>,
  @Json(name = "removed_comments")
  public val removedComments: List<ModRemoveCommentView>,
  @Json(name = "removed_communities")
  public val removedCommunities: List<ModRemoveCommunityView>,
  @Json(name = "banned_from_community")
  public val bannedFromCommunity: List<ModBanFromCommunityView>,
  public val banned: List<ModBanView>,
  @Json(name = "added_to_community")
  public val addedToCommunity: List<ModAddCommunityView>,
  @Json(name = "transferred_to_community")
  public val transferredToCommunity: List<ModTransferCommunityView>,
  public val added: List<ModAddView>,
  @Json(name = "admin_purged_persons")
  public val adminPurgedPersons: List<AdminPurgePersonView>,
  @Json(name = "admin_purged_communities")
  public val adminPurgedCommunities: List<AdminPurgeCommunityView>,
  @Json(name = "admin_purged_posts")
  public val adminPurgedPosts: List<AdminPurgePostView>,
  @Json(name = "admin_purged_comments")
  public val adminPurgedComments: List<AdminPurgeCommentView>,
  @Json(name = "hidden_communities")
  public val hiddenCommunities: List<ModHideCommunityView>,
) : Parcelable
