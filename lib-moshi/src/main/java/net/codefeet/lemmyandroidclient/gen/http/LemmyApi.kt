package net.codefeet.lemmyandroidclient.gen.http

import kotlin.Boolean
import kotlin.Long
import kotlin.String
import net.codefeet.lemmyandroidclient.gen.types.AddAdmin
import net.codefeet.lemmyandroidclient.gen.types.AddAdminResponse
import net.codefeet.lemmyandroidclient.gen.types.AddModToCommunity
import net.codefeet.lemmyandroidclient.gen.types.AddModToCommunityResponse
import net.codefeet.lemmyandroidclient.gen.types.ApproveRegistrationApplication
import net.codefeet.lemmyandroidclient.gen.types.BanFromCommunity
import net.codefeet.lemmyandroidclient.gen.types.BanFromCommunityResponse
import net.codefeet.lemmyandroidclient.gen.types.BanPerson
import net.codefeet.lemmyandroidclient.gen.types.BanPersonResponse
import net.codefeet.lemmyandroidclient.gen.types.BannedPersonsResponse
import net.codefeet.lemmyandroidclient.gen.types.BlockCommunity
import net.codefeet.lemmyandroidclient.gen.types.BlockCommunityResponse
import net.codefeet.lemmyandroidclient.gen.types.BlockPerson
import net.codefeet.lemmyandroidclient.gen.types.BlockPersonResponse
import net.codefeet.lemmyandroidclient.gen.types.ChangePassword
import net.codefeet.lemmyandroidclient.gen.types.CommentId
import net.codefeet.lemmyandroidclient.gen.types.CommentReplyResponse
import net.codefeet.lemmyandroidclient.gen.types.CommentReportResponse
import net.codefeet.lemmyandroidclient.gen.types.CommentResponse
import net.codefeet.lemmyandroidclient.gen.types.CommentSortType
import net.codefeet.lemmyandroidclient.gen.types.CommunityId
import net.codefeet.lemmyandroidclient.gen.types.CommunityResponse
import net.codefeet.lemmyandroidclient.gen.types.CreateComment
import net.codefeet.lemmyandroidclient.gen.types.CreateCommentLike
import net.codefeet.lemmyandroidclient.gen.types.CreateCommentReport
import net.codefeet.lemmyandroidclient.gen.types.CreateCommunity
import net.codefeet.lemmyandroidclient.gen.types.CreateCustomEmoji
import net.codefeet.lemmyandroidclient.gen.types.CreatePost
import net.codefeet.lemmyandroidclient.gen.types.CreatePostLike
import net.codefeet.lemmyandroidclient.gen.types.CreatePostReport
import net.codefeet.lemmyandroidclient.gen.types.CreatePrivateMessage
import net.codefeet.lemmyandroidclient.gen.types.CreatePrivateMessageReport
import net.codefeet.lemmyandroidclient.gen.types.CreateSite
import net.codefeet.lemmyandroidclient.gen.types.CustomEmojiResponse
import net.codefeet.lemmyandroidclient.gen.types.DeleteAccount
import net.codefeet.lemmyandroidclient.gen.types.DeleteAccountResponse
import net.codefeet.lemmyandroidclient.gen.types.DeleteComment
import net.codefeet.lemmyandroidclient.gen.types.DeleteCommunity
import net.codefeet.lemmyandroidclient.gen.types.DeleteCustomEmoji
import net.codefeet.lemmyandroidclient.gen.types.DeleteCustomEmojiResponse
import net.codefeet.lemmyandroidclient.gen.types.DeletePost
import net.codefeet.lemmyandroidclient.gen.types.DeletePrivateMessage
import net.codefeet.lemmyandroidclient.gen.types.DistinguishComment
import net.codefeet.lemmyandroidclient.gen.types.EditComment
import net.codefeet.lemmyandroidclient.gen.types.EditCommunity
import net.codefeet.lemmyandroidclient.gen.types.EditCustomEmoji
import net.codefeet.lemmyandroidclient.gen.types.EditPost
import net.codefeet.lemmyandroidclient.gen.types.EditPrivateMessage
import net.codefeet.lemmyandroidclient.gen.types.EditSite
import net.codefeet.lemmyandroidclient.gen.types.FeaturePost
import net.codefeet.lemmyandroidclient.gen.types.FollowCommunity
import net.codefeet.lemmyandroidclient.gen.types.GetCaptchaResponse
import net.codefeet.lemmyandroidclient.gen.types.GetCommentsResponse
import net.codefeet.lemmyandroidclient.gen.types.GetCommunityResponse
import net.codefeet.lemmyandroidclient.gen.types.GetFederatedInstancesResponse
import net.codefeet.lemmyandroidclient.gen.types.GetModlogResponse
import net.codefeet.lemmyandroidclient.gen.types.GetPersonDetailsResponse
import net.codefeet.lemmyandroidclient.gen.types.GetPersonMentionsResponse
import net.codefeet.lemmyandroidclient.gen.types.GetPostResponse
import net.codefeet.lemmyandroidclient.gen.types.GetPostsResponse
import net.codefeet.lemmyandroidclient.gen.types.GetRepliesResponse
import net.codefeet.lemmyandroidclient.gen.types.GetReportCountResponse
import net.codefeet.lemmyandroidclient.gen.types.GetSiteMetadataResponse
import net.codefeet.lemmyandroidclient.gen.types.GetSiteResponse
import net.codefeet.lemmyandroidclient.gen.types.GetUnreadCountResponse
import net.codefeet.lemmyandroidclient.gen.types.GetUnreadRegistrationApplicationCountResponse
import net.codefeet.lemmyandroidclient.gen.types.LeaveAdmin
import net.codefeet.lemmyandroidclient.gen.types.ListCommentReportsResponse
import net.codefeet.lemmyandroidclient.gen.types.ListCommunitiesResponse
import net.codefeet.lemmyandroidclient.gen.types.ListPostReportsResponse
import net.codefeet.lemmyandroidclient.gen.types.ListPrivateMessageReportsResponse
import net.codefeet.lemmyandroidclient.gen.types.ListRegistrationApplicationsResponse
import net.codefeet.lemmyandroidclient.gen.types.ListingType
import net.codefeet.lemmyandroidclient.gen.types.LockPost
import net.codefeet.lemmyandroidclient.gen.types.Login
import net.codefeet.lemmyandroidclient.gen.types.LoginResponse
import net.codefeet.lemmyandroidclient.gen.types.MarkAllAsRead
import net.codefeet.lemmyandroidclient.gen.types.MarkCommentReplyAsRead
import net.codefeet.lemmyandroidclient.gen.types.MarkPersonMentionAsRead
import net.codefeet.lemmyandroidclient.gen.types.MarkPostAsRead
import net.codefeet.lemmyandroidclient.gen.types.MarkPrivateMessageAsRead
import net.codefeet.lemmyandroidclient.gen.types.ModlogActionType
import net.codefeet.lemmyandroidclient.gen.types.PasswordChangeAfterReset
import net.codefeet.lemmyandroidclient.gen.types.PasswordReset
import net.codefeet.lemmyandroidclient.gen.types.PasswordResetResponse
import net.codefeet.lemmyandroidclient.gen.types.PersonId
import net.codefeet.lemmyandroidclient.gen.types.PersonMentionResponse
import net.codefeet.lemmyandroidclient.gen.types.PostId
import net.codefeet.lemmyandroidclient.gen.types.PostReportResponse
import net.codefeet.lemmyandroidclient.gen.types.PostResponse
import net.codefeet.lemmyandroidclient.gen.types.PrivateMessageReportResponse
import net.codefeet.lemmyandroidclient.gen.types.PrivateMessageResponse
import net.codefeet.lemmyandroidclient.gen.types.PrivateMessagesResponse
import net.codefeet.lemmyandroidclient.gen.types.PurgeComment
import net.codefeet.lemmyandroidclient.gen.types.PurgeCommunity
import net.codefeet.lemmyandroidclient.gen.types.PurgeItemResponse
import net.codefeet.lemmyandroidclient.gen.types.PurgePerson
import net.codefeet.lemmyandroidclient.gen.types.PurgePost
import net.codefeet.lemmyandroidclient.gen.types.Register
import net.codefeet.lemmyandroidclient.gen.types.RegistrationApplicationResponse
import net.codefeet.lemmyandroidclient.gen.types.RemoveComment
import net.codefeet.lemmyandroidclient.gen.types.RemoveCommunity
import net.codefeet.lemmyandroidclient.gen.types.RemovePost
import net.codefeet.lemmyandroidclient.gen.types.ResolveCommentReport
import net.codefeet.lemmyandroidclient.gen.types.ResolveObjectResponse
import net.codefeet.lemmyandroidclient.gen.types.ResolvePostReport
import net.codefeet.lemmyandroidclient.gen.types.ResolvePrivateMessageReport
import net.codefeet.lemmyandroidclient.gen.types.SaveComment
import net.codefeet.lemmyandroidclient.gen.types.SavePost
import net.codefeet.lemmyandroidclient.gen.types.SaveUserSettings
import net.codefeet.lemmyandroidclient.gen.types.SearchResponse
import net.codefeet.lemmyandroidclient.gen.types.SearchType
import net.codefeet.lemmyandroidclient.gen.types.SiteResponse
import net.codefeet.lemmyandroidclient.gen.types.SortType
import net.codefeet.lemmyandroidclient.gen.types.TransferCommunity
import net.codefeet.lemmyandroidclient.gen.types.VerifyEmail
import net.codefeet.lemmyandroidclient.gen.types.VerifyEmailResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

public interface LemmyApi {
  @GET("api/v3/site")
  public suspend fun getSite(@Query("auth") auth: String?): GetSiteResponse

  @POST("api/v3/site")
  public suspend fun createSite(@Body form: CreateSite): SiteResponse

  @PUT("api/v3/site")
  public suspend fun editSite(@Body form: EditSite): SiteResponse

  @POST("api/v3/user/leave_admin")
  public suspend fun leaveAdmin(@Body form: LeaveAdmin): GetSiteResponse

  @GET("api/v3/modlog")
  public suspend fun getModlog(
    @Query("mod_person_id") modPersonId: PersonId?,
    @Query("community_id") communityId: CommunityId?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("type") type: ModlogActionType?,
    @Query("other_person_id") otherPersonId: PersonId?,
    @Query("auth") auth: String?,
  ): GetModlogResponse

  @GET("api/v3/search")
  public suspend fun search(
    @Query("q") q: String,
    @Query("community_id") communityId: CommunityId?,
    @Query("community_name") communityName: String?,
    @Query("creator_id") creatorId: PersonId?,
    @Query("type") type: SearchType?,
    @Query("sort") sort: SortType?,
    @Query("listing_type") listingType: ListingType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String?,
  ): SearchResponse

  @GET("api/v3/resolve_object")
  public suspend fun resolveObject(@Query("q") q: String, @Query("auth") auth: String):
      ResolveObjectResponse

  @POST("api/v3/community")
  public suspend fun createCommunity(@Body form: CreateCommunity): CommunityResponse

  @GET("api/v3/community")
  public suspend fun getCommunity(
    @Query("id") id: CommunityId?,
    @Query("name") name: String?,
    @Query("auth") auth: String?,
  ): GetCommunityResponse

  @PUT("api/v3/community")
  public suspend fun editCommunity(@Body form: EditCommunity): CommunityResponse

  @GET("api/v3/community/list")
  public suspend fun listCommunities(
    @Query("type") type: ListingType?,
    @Query("sort") sort: SortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String?,
  ): ListCommunitiesResponse

  @POST("api/v3/community/follow")
  public suspend fun followCommunity(@Body form: FollowCommunity): CommunityResponse

  @POST("api/v3/community/block")
  public suspend fun blockCommunity(@Body form: BlockCommunity): BlockCommunityResponse

  @POST("api/v3/community/delete")
  public suspend fun deleteCommunity(@Body form: DeleteCommunity): CommunityResponse

  @POST("api/v3/community/remove")
  public suspend fun removeCommunity(@Body form: RemoveCommunity): CommunityResponse

  @POST("api/v3/community/transfer")
  public suspend fun transferCommunity(@Body form: TransferCommunity): GetCommunityResponse

  @POST("api/v3/community/ban_user")
  public suspend fun banFromCommunity(@Body form: BanFromCommunity): BanFromCommunityResponse

  @POST("api/v3/community/mod")
  public suspend fun addModToCommunity(@Body form: AddModToCommunity): AddModToCommunityResponse

  @POST("api/v3/post")
  public suspend fun createPost(@Body form: CreatePost): PostResponse

  @GET("api/v3/post")
  public suspend fun getPost(
    @Query("id") id: PostId?,
    @Query("comment_id") commentId: CommentId?,
    @Query("auth") auth: String?,
  ): GetPostResponse

  @PUT("api/v3/post")
  public suspend fun editPost(@Body form: EditPost): PostResponse

  @POST("api/v3/post/delete")
  public suspend fun deletePost(@Body form: DeletePost): PostResponse

  @POST("api/v3/post/remove")
  public suspend fun removePost(@Body form: RemovePost): PostResponse

  @POST("api/v3/post/mark_as_read")
  public suspend fun markPostAsRead(@Body form: MarkPostAsRead): PostResponse

  @POST("api/v3/post/lock")
  public suspend fun lockPost(@Body form: LockPost): PostResponse

  @POST("api/v3/post/feature")
  public suspend fun featurePost(@Body form: FeaturePost): PostResponse

  @GET("api/v3/post/list")
  public suspend fun getPosts(
    @Query("type") type: ListingType?,
    @Query("sort") sort: SortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("community_id") communityId: CommunityId?,
    @Query("community_name") communityName: String?,
    @Query("saved_only") savedOnly: Boolean?,
    @Query("auth") auth: String?,
  ): GetPostsResponse

  @POST("api/v3/post/like")
  public suspend fun likePost(@Body form: CreatePostLike): PostResponse

  @PUT("api/v3/post/save")
  public suspend fun savePost(@Body form: SavePost): PostResponse

  @POST("api/v3/post/report")
  public suspend fun createPostReport(@Body form: CreatePostReport): PostReportResponse

  @PUT("api/v3/post/report/resolve")
  public suspend fun resolvePostReport(@Body form: ResolvePostReport): PostReportResponse

  @GET("api/v3/post/report/list")
  public suspend fun listPostReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListPostReportsResponse

  @GET("api/v3/post/site_metadata")
  public suspend fun getSiteMetadata(@Query("url") url: String): GetSiteMetadataResponse

  @POST("api/v3/comment")
  public suspend fun createComment(@Body form: CreateComment): CommentResponse

  @PUT("api/v3/comment")
  public suspend fun editComment(@Body form: EditComment): CommentResponse

  @POST("api/v3/comment/delete")
  public suspend fun deleteComment(@Body form: DeleteComment): CommentResponse

  @POST("api/v3/comment/remove")
  public suspend fun removeComment(@Body form: RemoveComment): CommentResponse

  @POST("api/v3/comment/mark_as_read")
  public suspend fun markCommentReplyAsRead(@Body form: MarkCommentReplyAsRead):
      CommentReplyResponse

  @POST("api/v3/comment/like")
  public suspend fun likeComment(@Body form: CreateCommentLike): CommentResponse

  @PUT("api/v3/comment/save")
  public suspend fun saveComment(@Body form: SaveComment): CommentResponse

  @POST("api/v3/comment/distinguish")
  public suspend fun distinguishComment(@Body form: DistinguishComment): CommentResponse

  @GET("api/v3/comment/list")
  public suspend fun getComments(
    @Query("type") type: ListingType?,
    @Query("sort") sort: CommentSortType?,
    @Query("max_depth") maxDepth: Long?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("community_id") communityId: CommunityId?,
    @Query("community_name") communityName: String?,
    @Query("post_id") postId: PostId?,
    @Query("parent_id") parentId: CommentId?,
    @Query("saved_only") savedOnly: Boolean?,
    @Query("auth") auth: String?,
  ): GetCommentsResponse

  @GET("api/v3/comment")
  public suspend fun getComment(@Query("id") id: CommentId, @Query("auth") auth: String?):
      CommentResponse

  @POST("api/v3/comment/report")
  public suspend fun createCommentReport(@Body form: CreateCommentReport): CommentReportResponse

  @PUT("api/v3/comment/report/resolve")
  public suspend fun resolveCommentReport(@Body form: ResolveCommentReport): CommentReportResponse

  @GET("api/v3/comment/report/list")
  public suspend fun listCommentReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListCommentReportsResponse

  @GET("api/v3/private_message/list")
  public suspend fun getPrivateMessages(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): PrivateMessagesResponse

  @POST("api/v3/private_message")
  public suspend fun createPrivateMessage(@Body form: CreatePrivateMessage): PrivateMessageResponse

  @PUT("api/v3/private_message")
  public suspend fun editPrivateMessage(@Body form: EditPrivateMessage): PrivateMessageResponse

  @POST("api/v3/private_message/delete")
  public suspend fun deletePrivateMessage(@Body form: DeletePrivateMessage): PrivateMessageResponse

  @POST("api/v3/private_message/mark_as_read")
  public suspend fun markPrivateMessageAsRead(@Body form: MarkPrivateMessageAsRead):
      PrivateMessageResponse

  @POST("api/v3/private_message/report")
  public suspend fun createPrivateMessageReport(@Body form: CreatePrivateMessageReport):
      PrivateMessageReportResponse

  @PUT("api/v3/private_message/report/resolve")
  public suspend fun resolvePrivateMessageReport(@Body form: ResolvePrivateMessageReport):
      PrivateMessageReportResponse

  @GET("api/v3/private_message/report/list")
  public suspend fun listPrivateMessageReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("auth") auth: String,
  ): ListPrivateMessageReportsResponse

  @POST("api/v3/user/register")
  public suspend fun register(@Body form: Register): LoginResponse

  @POST("api/v3/user/login")
  public suspend fun login(@Body form: Login): LoginResponse

  @GET("api/v3/user")
  public suspend fun getPersonDetails(
    @Query("person_id") personId: PersonId?,
    @Query("username") username: String?,
    @Query("sort") sort: SortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("community_id") communityId: CommunityId?,
    @Query("saved_only") savedOnly: Boolean?,
    @Query("auth") auth: String?,
  ): GetPersonDetailsResponse

  @GET("api/v3/user/mention")
  public suspend fun getPersonMentions(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetPersonMentionsResponse

  @POST("api/v3/user/mention/mark_as_read")
  public suspend fun markPersonMentionAsRead(@Body form: MarkPersonMentionAsRead):
      PersonMentionResponse

  @GET("api/v3/user/replies")
  public suspend fun getReplies(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetRepliesResponse

  @POST("api/v3/user/ban")
  public suspend fun banPerson(@Body form: BanPerson): BanPersonResponse

  @GET("api/v3/user/banned")
  public suspend fun getBannedPersons(@Query("auth") auth: String): BannedPersonsResponse

  @POST("api/v3/user/block")
  public suspend fun blockPerson(@Body form: BlockPerson): BlockPersonResponse

  @GET("api/v3/user/get_captcha")
  public suspend fun getCaptcha(@Query("auth") auth: String?): GetCaptchaResponse

  @POST("api/v3/user/delete_account")
  public suspend fun deleteAccount(@Body form: DeleteAccount): DeleteAccountResponse

  @POST("api/v3/user/password_reset")
  public suspend fun passwordReset(@Body form: PasswordReset): PasswordResetResponse

  @POST("api/v3/user/password_change")
  public suspend fun passwordChangeAfterReset(@Body form: PasswordChangeAfterReset): LoginResponse

  @POST("api/v3/user/mark_all_as_read")
  public suspend fun markAllAsRead(@Body form: MarkAllAsRead): GetRepliesResponse

  @PUT("api/v3/user/save_user_settings")
  public suspend fun saveUserSettings(@Body form: SaveUserSettings): LoginResponse

  @PUT("api/v3/user/change_password")
  public suspend fun changePassword(@Body form: ChangePassword): LoginResponse

  @GET("api/v3/user/report_count")
  public suspend fun getReportCount(@Query("community_id") communityId: CommunityId?, @Query("auth")
      auth: String): GetReportCountResponse

  @GET("api/v3/user/unread_count")
  public suspend fun getUnreadCount(@Query("auth") auth: String): GetUnreadCountResponse

  @POST("api/v3/user/verify_email")
  public suspend fun verifyEmail(@Body form: VerifyEmail): VerifyEmailResponse

  @POST("api/v3/admin/add")
  public suspend fun addAdmin(@Body form: AddAdmin): AddAdminResponse

  @GET("api/v3/admin/registration_application/count")
  public suspend fun getUnreadRegistrationApplicationCount(@Query("auth") auth: String):
      GetUnreadRegistrationApplicationCountResponse

  @GET("api/v3/admin/registration_application/list")
  public suspend fun listRegistrationApplications(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): ListRegistrationApplicationsResponse

  @PUT("api/v3/admin/registration_application/approve")
  public suspend fun approveRegistrationApplication(@Body form: ApproveRegistrationApplication):
      RegistrationApplicationResponse

  @POST("api/v3/admin/purge/person")
  public suspend fun purgePerson(@Body form: PurgePerson): PurgeItemResponse

  @POST("api/v3/admin/purge/community")
  public suspend fun purgeCommunity(@Body form: PurgeCommunity): PurgeItemResponse

  @POST("api/v3/admin/purge/post")
  public suspend fun purgePost(@Body form: PurgePost): PurgeItemResponse

  @POST("api/v3/admin/purge/comment")
  public suspend fun purgeComment(@Body form: PurgeComment): PurgeItemResponse

  @POST("api/v3/custom_emoji")
  public suspend fun createCustomEmoji(@Body form: CreateCustomEmoji): CustomEmojiResponse

  @PUT("api/v3/custom_emoji")
  public suspend fun editCustomEmoji(@Body form: EditCustomEmoji): CustomEmojiResponse

  @POST("api/v3/custom_emoji/delete")
  public suspend fun deleteCustomEmoji(@Body form: DeleteCustomEmoji): DeleteCustomEmojiResponse

  @GET("api/v3/federated_instances")
  public suspend fun getFederatedInstances(@Query("auth") auth: String?):
      GetFederatedInstancesResponse
}
