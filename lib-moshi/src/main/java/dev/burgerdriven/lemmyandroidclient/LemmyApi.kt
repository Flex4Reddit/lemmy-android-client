package dev.burgerdriven.lemmyandroidclient

import dev.burgerdriven.lemmyandroidclient.types.AddAdmin
import dev.burgerdriven.lemmyandroidclient.types.AddAdminResponse
import dev.burgerdriven.lemmyandroidclient.types.AddModToCommunity
import dev.burgerdriven.lemmyandroidclient.types.AddModToCommunityResponse
import dev.burgerdriven.lemmyandroidclient.types.ApproveRegistrationApplication
import dev.burgerdriven.lemmyandroidclient.types.BanFromCommunity
import dev.burgerdriven.lemmyandroidclient.types.BanFromCommunityResponse
import dev.burgerdriven.lemmyandroidclient.types.BanPerson
import dev.burgerdriven.lemmyandroidclient.types.BanPersonResponse
import dev.burgerdriven.lemmyandroidclient.types.BannedPersonsResponse
import dev.burgerdriven.lemmyandroidclient.types.BlockCommunity
import dev.burgerdriven.lemmyandroidclient.types.BlockCommunityResponse
import dev.burgerdriven.lemmyandroidclient.types.BlockPerson
import dev.burgerdriven.lemmyandroidclient.types.BlockPersonResponse
import dev.burgerdriven.lemmyandroidclient.types.ChangePassword
import dev.burgerdriven.lemmyandroidclient.types.CommentId
import dev.burgerdriven.lemmyandroidclient.types.CommentReplyResponse
import dev.burgerdriven.lemmyandroidclient.types.CommentReportResponse
import dev.burgerdriven.lemmyandroidclient.types.CommentResponse
import dev.burgerdriven.lemmyandroidclient.types.CommentSortType
import dev.burgerdriven.lemmyandroidclient.types.CommunityId
import dev.burgerdriven.lemmyandroidclient.types.CommunityResponse
import dev.burgerdriven.lemmyandroidclient.types.CreateComment
import dev.burgerdriven.lemmyandroidclient.types.CreateCommentLike
import dev.burgerdriven.lemmyandroidclient.types.CreateCommentReport
import dev.burgerdriven.lemmyandroidclient.types.CreateCommunity
import dev.burgerdriven.lemmyandroidclient.types.CreateCustomEmoji
import dev.burgerdriven.lemmyandroidclient.types.CreatePost
import dev.burgerdriven.lemmyandroidclient.types.CreatePostLike
import dev.burgerdriven.lemmyandroidclient.types.CreatePostReport
import dev.burgerdriven.lemmyandroidclient.types.CreatePrivateMessage
import dev.burgerdriven.lemmyandroidclient.types.CreatePrivateMessageReport
import dev.burgerdriven.lemmyandroidclient.types.CreateSite
import dev.burgerdriven.lemmyandroidclient.types.CustomEmojiResponse
import dev.burgerdriven.lemmyandroidclient.types.DeleteAccount
import dev.burgerdriven.lemmyandroidclient.types.DeleteAccountResponse
import dev.burgerdriven.lemmyandroidclient.types.DeleteComment
import dev.burgerdriven.lemmyandroidclient.types.DeleteCommunity
import dev.burgerdriven.lemmyandroidclient.types.DeleteCustomEmoji
import dev.burgerdriven.lemmyandroidclient.types.DeleteCustomEmojiResponse
import dev.burgerdriven.lemmyandroidclient.types.DeletePost
import dev.burgerdriven.lemmyandroidclient.types.DeletePrivateMessage
import dev.burgerdriven.lemmyandroidclient.types.DistinguishComment
import dev.burgerdriven.lemmyandroidclient.types.EditComment
import dev.burgerdriven.lemmyandroidclient.types.EditCommunity
import dev.burgerdriven.lemmyandroidclient.types.EditCustomEmoji
import dev.burgerdriven.lemmyandroidclient.types.EditPost
import dev.burgerdriven.lemmyandroidclient.types.EditPrivateMessage
import dev.burgerdriven.lemmyandroidclient.types.EditSite
import dev.burgerdriven.lemmyandroidclient.types.FeaturePost
import dev.burgerdriven.lemmyandroidclient.types.FollowCommunity
import dev.burgerdriven.lemmyandroidclient.types.GetCaptchaResponse
import dev.burgerdriven.lemmyandroidclient.types.GetCommentsResponse
import dev.burgerdriven.lemmyandroidclient.types.GetCommunityResponse
import dev.burgerdriven.lemmyandroidclient.types.GetFederatedInstancesResponse
import dev.burgerdriven.lemmyandroidclient.types.GetModlogResponse
import dev.burgerdriven.lemmyandroidclient.types.GetPersonDetailsResponse
import dev.burgerdriven.lemmyandroidclient.types.GetPersonMentionsResponse
import dev.burgerdriven.lemmyandroidclient.types.GetPostResponse
import dev.burgerdriven.lemmyandroidclient.types.GetPostsResponse
import dev.burgerdriven.lemmyandroidclient.types.GetRepliesResponse
import dev.burgerdriven.lemmyandroidclient.types.GetReportCountResponse
import dev.burgerdriven.lemmyandroidclient.types.GetSiteMetadataResponse
import dev.burgerdriven.lemmyandroidclient.types.GetSiteResponse
import dev.burgerdriven.lemmyandroidclient.types.GetUnreadCountResponse
import dev.burgerdriven.lemmyandroidclient.types.GetUnreadRegistrationApplicationCountResponse
import dev.burgerdriven.lemmyandroidclient.types.LeaveAdmin
import dev.burgerdriven.lemmyandroidclient.types.ListCommentReportsResponse
import dev.burgerdriven.lemmyandroidclient.types.ListCommunitiesResponse
import dev.burgerdriven.lemmyandroidclient.types.ListPostReportsResponse
import dev.burgerdriven.lemmyandroidclient.types.ListPrivateMessageReportsResponse
import dev.burgerdriven.lemmyandroidclient.types.ListRegistrationApplicationsResponse
import dev.burgerdriven.lemmyandroidclient.types.ListingType
import dev.burgerdriven.lemmyandroidclient.types.LockPost
import dev.burgerdriven.lemmyandroidclient.types.Login
import dev.burgerdriven.lemmyandroidclient.types.LoginResponse
import dev.burgerdriven.lemmyandroidclient.types.MarkAllAsRead
import dev.burgerdriven.lemmyandroidclient.types.MarkCommentReplyAsRead
import dev.burgerdriven.lemmyandroidclient.types.MarkPersonMentionAsRead
import dev.burgerdriven.lemmyandroidclient.types.MarkPostAsRead
import dev.burgerdriven.lemmyandroidclient.types.MarkPrivateMessageAsRead
import dev.burgerdriven.lemmyandroidclient.types.ModlogActionType
import dev.burgerdriven.lemmyandroidclient.types.PasswordChangeAfterReset
import dev.burgerdriven.lemmyandroidclient.types.PasswordReset
import dev.burgerdriven.lemmyandroidclient.types.PasswordResetResponse
import dev.burgerdriven.lemmyandroidclient.types.PersonId
import dev.burgerdriven.lemmyandroidclient.types.PersonMentionResponse
import dev.burgerdriven.lemmyandroidclient.types.PostId
import dev.burgerdriven.lemmyandroidclient.types.PostReportResponse
import dev.burgerdriven.lemmyandroidclient.types.PostResponse
import dev.burgerdriven.lemmyandroidclient.types.PrivateMessageReportResponse
import dev.burgerdriven.lemmyandroidclient.types.PrivateMessageResponse
import dev.burgerdriven.lemmyandroidclient.types.PrivateMessagesResponse
import dev.burgerdriven.lemmyandroidclient.types.PurgeComment
import dev.burgerdriven.lemmyandroidclient.types.PurgeCommunity
import dev.burgerdriven.lemmyandroidclient.types.PurgeItemResponse
import dev.burgerdriven.lemmyandroidclient.types.PurgePerson
import dev.burgerdriven.lemmyandroidclient.types.PurgePost
import dev.burgerdriven.lemmyandroidclient.types.Register
import dev.burgerdriven.lemmyandroidclient.types.RegistrationApplicationResponse
import dev.burgerdriven.lemmyandroidclient.types.RemoveComment
import dev.burgerdriven.lemmyandroidclient.types.RemoveCommunity
import dev.burgerdriven.lemmyandroidclient.types.RemovePost
import dev.burgerdriven.lemmyandroidclient.types.ResolveCommentReport
import dev.burgerdriven.lemmyandroidclient.types.ResolveObjectResponse
import dev.burgerdriven.lemmyandroidclient.types.ResolvePostReport
import dev.burgerdriven.lemmyandroidclient.types.ResolvePrivateMessageReport
import dev.burgerdriven.lemmyandroidclient.types.SaveComment
import dev.burgerdriven.lemmyandroidclient.types.SavePost
import dev.burgerdriven.lemmyandroidclient.types.SaveUserSettings
import dev.burgerdriven.lemmyandroidclient.types.SearchResponse
import dev.burgerdriven.lemmyandroidclient.types.SearchType
import dev.burgerdriven.lemmyandroidclient.types.SiteResponse
import dev.burgerdriven.lemmyandroidclient.types.SortType
import dev.burgerdriven.lemmyandroidclient.types.TransferCommunity
import dev.burgerdriven.lemmyandroidclient.types.VerifyEmail
import dev.burgerdriven.lemmyandroidclient.types.VerifyEmailResponse
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

public interface LemmyApi {
  @GET("site")
  public suspend fun getSite(@Query("auth") auth: String?): GetSiteResponse

  @POST("site")
  public suspend fun createSite(@Body form: CreateSite): SiteResponse

  @PUT("site")
  public suspend fun editSite(@Body form: EditSite): SiteResponse

  @POST("user/leave_admin")
  public suspend fun leaveAdmin(@Body form: LeaveAdmin): GetSiteResponse

  @GET("modlog")
  public suspend fun getModlog(
    @Query("mod_person_id") modPersonId: PersonId?,
    @Query("community_id") communityId: CommunityId?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("type") type: ModlogActionType?,
    @Query("other_person_id") otherPersonId: PersonId?,
    @Query("auth") auth: String?,
  ): GetModlogResponse

  @GET("search")
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

  @GET("resolve_object")
  public suspend fun resolveObject(@Query("q") q: String, @Query("auth") auth: String):
      ResolveObjectResponse

  @POST("community")
  public suspend fun createCommunity(@Body form: CreateCommunity): CommunityResponse

  @GET("community")
  public suspend fun getCommunity(
    @Query("id") id: CommunityId?,
    @Query("name") name: String?,
    @Query("auth") auth: String?,
  ): GetCommunityResponse

  @PUT("community")
  public suspend fun editCommunity(@Body form: EditCommunity): CommunityResponse

  @GET("community/list")
  public suspend fun listCommunities(
    @Query("type") type: ListingType?,
    @Query("sort") sort: SortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String?,
  ): ListCommunitiesResponse

  @POST("community/follow")
  public suspend fun followCommunity(@Body form: FollowCommunity): CommunityResponse

  @POST("community/block")
  public suspend fun blockCommunity(@Body form: BlockCommunity): BlockCommunityResponse

  @POST("community/delete")
  public suspend fun deleteCommunity(@Body form: DeleteCommunity): CommunityResponse

  @POST("community/remove")
  public suspend fun removeCommunity(@Body form: RemoveCommunity): CommunityResponse

  @POST("community/transfer")
  public suspend fun transferCommunity(@Body form: TransferCommunity): GetCommunityResponse

  @POST("community/ban_user")
  public suspend fun banFromCommunity(@Body form: BanFromCommunity): BanFromCommunityResponse

  @POST("community/mod")
  public suspend fun addModToCommunity(@Body form: AddModToCommunity): AddModToCommunityResponse

  @POST("post")
  public suspend fun createPost(@Body form: CreatePost): PostResponse

  @GET("post")
  public suspend fun getPost(
    @Query("id") id: PostId?,
    @Query("comment_id") commentId: CommentId?,
    @Query("auth") auth: String?,
  ): GetPostResponse

  @PUT("post")
  public suspend fun editPost(@Body form: EditPost): PostResponse

  @POST("post/delete")
  public suspend fun deletePost(@Body form: DeletePost): PostResponse

  @POST("post/remove")
  public suspend fun removePost(@Body form: RemovePost): PostResponse

  @POST("post/mark_as_read")
  public suspend fun markPostAsRead(@Body form: MarkPostAsRead): PostResponse

  @POST("post/lock")
  public suspend fun lockPost(@Body form: LockPost): PostResponse

  @POST("post/feature")
  public suspend fun featurePost(@Body form: FeaturePost): PostResponse

  @GET("post/list")
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

  @POST("post/like")
  public suspend fun likePost(@Body form: CreatePostLike): PostResponse

  @PUT("post/save")
  public suspend fun savePost(@Body form: SavePost): PostResponse

  @POST("post/report")
  public suspend fun createPostReport(@Body form: CreatePostReport): PostReportResponse

  @PUT("post/report/resolve")
  public suspend fun resolvePostReport(@Body form: ResolvePostReport): PostReportResponse

  @GET("post/report/list")
  public suspend fun listPostReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListPostReportsResponse

  @GET("post/site_metadata")
  public suspend fun getSiteMetadata(@Query("url") url: String): GetSiteMetadataResponse

  @POST("comment")
  public suspend fun createComment(@Body form: CreateComment): CommentResponse

  @PUT("comment")
  public suspend fun editComment(@Body form: EditComment): CommentResponse

  @POST("comment/delete")
  public suspend fun deleteComment(@Body form: DeleteComment): CommentResponse

  @POST("comment/remove")
  public suspend fun removeComment(@Body form: RemoveComment): CommentResponse

  @POST("comment/mark_as_read")
  public suspend fun markCommentReplyAsRead(@Body form: MarkCommentReplyAsRead):
      CommentReplyResponse

  @POST("comment/like")
  public suspend fun likeComment(@Body form: CreateCommentLike): CommentResponse

  @PUT("comment/save")
  public suspend fun saveComment(@Body form: SaveComment): CommentResponse

  @POST("comment/distinguish")
  public suspend fun distinguishComment(@Body form: DistinguishComment): CommentResponse

  @GET("comment/list")
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

  @GET("comment")
  public suspend fun getComment(@Query("id") id: CommentId, @Query("auth") auth: String?):
      CommentResponse

  @POST("comment/report")
  public suspend fun createCommentReport(@Body form: CreateCommentReport): CommentReportResponse

  @PUT("comment/report/resolve")
  public suspend fun resolveCommentReport(@Body form: ResolveCommentReport): CommentReportResponse

  @GET("comment/report/list")
  public suspend fun listCommentReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListCommentReportsResponse

  @GET("private_message/list")
  public suspend fun getPrivateMessages(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): PrivateMessagesResponse

  @POST("private_message")
  public suspend fun createPrivateMessage(@Body form: CreatePrivateMessage): PrivateMessageResponse

  @PUT("private_message")
  public suspend fun editPrivateMessage(@Body form: EditPrivateMessage): PrivateMessageResponse

  @POST("private_message/delete")
  public suspend fun deletePrivateMessage(@Body form: DeletePrivateMessage): PrivateMessageResponse

  @POST("private_message/mark_as_read")
  public suspend fun markPrivateMessageAsRead(@Body form: MarkPrivateMessageAsRead):
      PrivateMessageResponse

  @POST("private_message/report")
  public suspend fun createPrivateMessageReport(@Body form: CreatePrivateMessageReport):
      PrivateMessageReportResponse

  @PUT("private_message/report/resolve")
  public suspend fun resolvePrivateMessageReport(@Body form: ResolvePrivateMessageReport):
      PrivateMessageReportResponse

  @GET("private_message/report/list")
  public suspend fun listPrivateMessageReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("auth") auth: String,
  ): ListPrivateMessageReportsResponse

  @POST("user/register")
  public suspend fun register(@Body form: Register): LoginResponse

  @POST("user/login")
  public suspend fun login(@Body form: Login): LoginResponse

  @GET("user")
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

  @GET("user/mention")
  public suspend fun getPersonMentions(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetPersonMentionsResponse

  @POST("user/mention/mark_as_read")
  public suspend fun markPersonMentionAsRead(@Body form: MarkPersonMentionAsRead):
      PersonMentionResponse

  @GET("user/replies")
  public suspend fun getReplies(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetRepliesResponse

  @POST("user/ban")
  public suspend fun banPerson(@Body form: BanPerson): BanPersonResponse

  @GET("user/banned")
  public suspend fun getBannedPersons(@Query("auth") auth: String): BannedPersonsResponse

  @POST("user/block")
  public suspend fun blockPerson(@Body form: BlockPerson): BlockPersonResponse

  @GET("user/get_captcha")
  public suspend fun getCaptcha(@Query("auth") auth: String?): GetCaptchaResponse

  @POST("user/delete_account")
  public suspend fun deleteAccount(@Body form: DeleteAccount): DeleteAccountResponse

  @POST("user/password_reset")
  public suspend fun passwordReset(@Body form: PasswordReset): PasswordResetResponse

  @POST("user/password_change")
  public suspend fun passwordChangeAfterReset(@Body form: PasswordChangeAfterReset): LoginResponse

  @POST("user/mark_all_as_read")
  public suspend fun markAllAsRead(@Body form: MarkAllAsRead): GetRepliesResponse

  @PUT("user/save_user_settings")
  public suspend fun saveUserSettings(@Body form: SaveUserSettings): LoginResponse

  @PUT("user/change_password")
  public suspend fun changePassword(@Body form: ChangePassword): LoginResponse

  @GET("user/report_count")
  public suspend fun getReportCount(@Query("community_id") communityId: CommunityId?, @Query("auth")
      auth: String): GetReportCountResponse

  @GET("user/unread_count")
  public suspend fun getUnreadCount(@Query("auth") auth: String): GetUnreadCountResponse

  @POST("user/verify_email")
  public suspend fun verifyEmail(@Body form: VerifyEmail): VerifyEmailResponse

  @POST("admin/add")
  public suspend fun addAdmin(@Body form: AddAdmin): AddAdminResponse

  @GET("admin/registration_application/count")
  public suspend fun getUnreadRegistrationApplicationCount(@Query("auth") auth: String):
      GetUnreadRegistrationApplicationCountResponse

  @GET("admin/registration_application/list")
  public suspend fun listRegistrationApplications(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): ListRegistrationApplicationsResponse

  @PUT("admin/registration_application/approve")
  public suspend fun approveRegistrationApplication(@Body form: ApproveRegistrationApplication):
      RegistrationApplicationResponse

  @POST("admin/purge/person")
  public suspend fun purgePerson(@Body form: PurgePerson): PurgeItemResponse

  @POST("admin/purge/community")
  public suspend fun purgeCommunity(@Body form: PurgeCommunity): PurgeItemResponse

  @POST("admin/purge/post")
  public suspend fun purgePost(@Body form: PurgePost): PurgeItemResponse

  @POST("admin/purge/comment")
  public suspend fun purgeComment(@Body form: PurgeComment): PurgeItemResponse

  @POST("custom_emoji")
  public suspend fun createCustomEmoji(@Body form: CreateCustomEmoji): CustomEmojiResponse

  @PUT("custom_emoji")
  public suspend fun editCustomEmoji(@Body form: EditCustomEmoji): CustomEmojiResponse

  @POST("custom_emoji/delete")
  public suspend fun deleteCustomEmoji(@Body form: DeleteCustomEmoji): DeleteCustomEmojiResponse

  @GET("federated_instances")
  public suspend fun getFederatedInstances(@Query("auth") auth: String?):
      GetFederatedInstancesResponse
}
