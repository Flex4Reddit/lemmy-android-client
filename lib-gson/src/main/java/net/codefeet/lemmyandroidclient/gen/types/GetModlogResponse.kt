package net.codefeet.lemmyandroidclient.gen.types

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlin.collections.List
import kotlinx.parcelize.Parcelize

@Parcelize
public data class GetModlogResponse(
  @SerializedName("removed_posts")
  public val removedPosts: List<ModRemovePostView>,
  @SerializedName("locked_posts")
  public val lockedPosts: List<ModLockPostView>,
  @SerializedName("featured_posts")
  public val featuredPosts: List<ModFeaturePostView>,
  @SerializedName("removed_comments")
  public val removedComments: List<ModRemoveCommentView>,
  @SerializedName("removed_communities")
  public val removedCommunities: List<ModRemoveCommunityView>,
  @SerializedName("banned_from_community")
  public val bannedFromCommunity: List<ModBanFromCommunityView>,
  public val banned: List<ModBanView>,
  @SerializedName("added_to_community")
  public val addedToCommunity: List<ModAddCommunityView>,
  @SerializedName("transferred_to_community")
  public val transferredToCommunity: List<ModTransferCommunityView>,
  public val added: List<ModAddView>,
  @SerializedName("admin_purged_persons")
  public val adminPurgedPersons: List<AdminPurgePersonView>,
  @SerializedName("admin_purged_communities")
  public val adminPurgedCommunities: List<AdminPurgeCommunityView>,
  @SerializedName("admin_purged_posts")
  public val adminPurgedPosts: List<AdminPurgePostView>,
  @SerializedName("admin_purged_comments")
  public val adminPurgedComments: List<AdminPurgeCommentView>,
  @SerializedName("hidden_communities")
  public val hiddenCommunities: List<ModHideCommunityView>,
) : Parcelable
