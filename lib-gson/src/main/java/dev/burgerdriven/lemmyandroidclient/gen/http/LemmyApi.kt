package dev.burgerdriven.lemmyandroidclient.gen.http

import dev.burgerdriven.lemmyandroidclient.gen.types.AddAdmin
import dev.burgerdriven.lemmyandroidclient.gen.types.AddAdminResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.AddModToCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.AddModToCommunityResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ApproveRegistrationApplication
import dev.burgerdriven.lemmyandroidclient.gen.types.BanFromCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.BanFromCommunityResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.BanPerson
import dev.burgerdriven.lemmyandroidclient.gen.types.BanPersonResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.BannedPersonsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.BlockCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.BlockCommunityResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.BlockPerson
import dev.burgerdriven.lemmyandroidclient.gen.types.BlockPersonResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ChangePassword
import dev.burgerdriven.lemmyandroidclient.gen.types.CommentId
import dev.burgerdriven.lemmyandroidclient.gen.types.CommentReplyResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.CommentReportResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.CommentResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.CommentSortType
import dev.burgerdriven.lemmyandroidclient.gen.types.CommunityId
import dev.burgerdriven.lemmyandroidclient.gen.types.CommunityResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateComment
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateCommentLike
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateCommentReport
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateCustomEmoji
import dev.burgerdriven.lemmyandroidclient.gen.types.CreatePost
import dev.burgerdriven.lemmyandroidclient.gen.types.CreatePostLike
import dev.burgerdriven.lemmyandroidclient.gen.types.CreatePostReport
import dev.burgerdriven.lemmyandroidclient.gen.types.CreatePrivateMessage
import dev.burgerdriven.lemmyandroidclient.gen.types.CreatePrivateMessageReport
import dev.burgerdriven.lemmyandroidclient.gen.types.CreateSite
import dev.burgerdriven.lemmyandroidclient.gen.types.CustomEmojiResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteAccount
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteAccountResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteComment
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteCustomEmoji
import dev.burgerdriven.lemmyandroidclient.gen.types.DeleteCustomEmojiResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.DeletePost
import dev.burgerdriven.lemmyandroidclient.gen.types.DeletePrivateMessage
import dev.burgerdriven.lemmyandroidclient.gen.types.DistinguishComment
import dev.burgerdriven.lemmyandroidclient.gen.types.EditComment
import dev.burgerdriven.lemmyandroidclient.gen.types.EditCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.EditCustomEmoji
import dev.burgerdriven.lemmyandroidclient.gen.types.EditPost
import dev.burgerdriven.lemmyandroidclient.gen.types.EditPrivateMessage
import dev.burgerdriven.lemmyandroidclient.gen.types.EditSite
import dev.burgerdriven.lemmyandroidclient.gen.types.FeaturePost
import dev.burgerdriven.lemmyandroidclient.gen.types.FollowCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.GetCaptchaResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetCommentsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetCommunityResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetFederatedInstancesResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetModlogResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetPersonDetailsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetPersonMentionsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetPostResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetPostsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetRepliesResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetReportCountResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetSiteMetadataResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetSiteResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetUnreadCountResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.GetUnreadRegistrationApplicationCountResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.LeaveAdmin
import dev.burgerdriven.lemmyandroidclient.gen.types.ListCommentReportsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ListCommunitiesResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ListPostReportsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ListPrivateMessageReportsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ListRegistrationApplicationsResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import dev.burgerdriven.lemmyandroidclient.gen.types.LockPost
import dev.burgerdriven.lemmyandroidclient.gen.types.Login
import dev.burgerdriven.lemmyandroidclient.gen.types.LoginResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.MarkAllAsRead
import dev.burgerdriven.lemmyandroidclient.gen.types.MarkCommentReplyAsRead
import dev.burgerdriven.lemmyandroidclient.gen.types.MarkPersonMentionAsRead
import dev.burgerdriven.lemmyandroidclient.gen.types.MarkPostAsRead
import dev.burgerdriven.lemmyandroidclient.gen.types.MarkPrivateMessageAsRead
import dev.burgerdriven.lemmyandroidclient.gen.types.ModlogActionType
import dev.burgerdriven.lemmyandroidclient.gen.types.PasswordChangeAfterReset
import dev.burgerdriven.lemmyandroidclient.gen.types.PasswordReset
import dev.burgerdriven.lemmyandroidclient.gen.types.PasswordResetResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PersonId
import dev.burgerdriven.lemmyandroidclient.gen.types.PersonMentionResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PostId
import dev.burgerdriven.lemmyandroidclient.gen.types.PostReportResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PostResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PrivateMessageReportResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PrivateMessageResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PrivateMessagesResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PurgeComment
import dev.burgerdriven.lemmyandroidclient.gen.types.PurgeCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.PurgeItemResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.PurgePerson
import dev.burgerdriven.lemmyandroidclient.gen.types.PurgePost
import dev.burgerdriven.lemmyandroidclient.gen.types.Register
import dev.burgerdriven.lemmyandroidclient.gen.types.RegistrationApplicationResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.RemoveComment
import dev.burgerdriven.lemmyandroidclient.gen.types.RemoveCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.RemovePost
import dev.burgerdriven.lemmyandroidclient.gen.types.ResolveCommentReport
import dev.burgerdriven.lemmyandroidclient.gen.types.ResolveObjectResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.ResolvePostReport
import dev.burgerdriven.lemmyandroidclient.gen.types.ResolvePrivateMessageReport
import dev.burgerdriven.lemmyandroidclient.gen.types.SaveComment
import dev.burgerdriven.lemmyandroidclient.gen.types.SavePost
import dev.burgerdriven.lemmyandroidclient.gen.types.SaveUserSettings
import dev.burgerdriven.lemmyandroidclient.gen.types.SearchResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.SearchType
import dev.burgerdriven.lemmyandroidclient.gen.types.SiteResponse
import dev.burgerdriven.lemmyandroidclient.gen.types.SortType
import dev.burgerdriven.lemmyandroidclient.gen.types.TransferCommunity
import dev.burgerdriven.lemmyandroidclient.gen.types.VerifyEmail
import dev.burgerdriven.lemmyandroidclient.gen.types.VerifyEmailResponse
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

public interface LemmyApi {
  @GET(api/v3/"site")
  public suspend fun getSite(@Query("auth") auth: String?): GetSiteResponse

  @POST(api/v3/"site")
  public suspend fun createSite(@Body form: CreateSite): SiteResponse

  @PUT(api/v3/"site")
  public suspend fun editSite(@Body form: EditSite): SiteResponse

  @POST(api/v3/"user/leave_admin")
  public suspend fun leaveAdmin(@Body form: LeaveAdmin): GetSiteResponse

  @GET(api/v3/"modlog")
  public suspend fun getModlog(
    @Query("mod_person_id") modPersonId: PersonId?,
    @Query("community_id") communityId: CommunityId?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("type") type: ModlogActionType?,
    @Query("other_person_id") otherPersonId: PersonId?,
    @Query("auth") auth: String?,
  ): GetModlogResponse

  @GET(api/v3/"search")
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

  @GET(api/v3/"resolve_object")
  public suspend fun resolveObject(@Query("q") q: String, @Query("auth") auth: String):
      ResolveObjectResponse

  @POST(api/v3/"community")
  public suspend fun createCommunity(@Body form: CreateCommunity): CommunityResponse

  @GET(api/v3/"community")
  public suspend fun getCommunity(
    @Query("id") id: CommunityId?,
    @Query("name") name: String?,
    @Query("auth") auth: String?,
  ): GetCommunityResponse

  @PUT(api/v3/"community")
  public suspend fun editCommunity(@Body form: EditCommunity): CommunityResponse

  @GET(api/v3/"community/list")
  public suspend fun listCommunities(
    @Query("type") type: ListingType?,
    @Query("sort") sort: SortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String?,
  ): ListCommunitiesResponse

  @POST(api/v3/"community/follow")
  public suspend fun followCommunity(@Body form: FollowCommunity): CommunityResponse

  @POST(api/v3/"community/block")
  public suspend fun blockCommunity(@Body form: BlockCommunity): BlockCommunityResponse

  @POST(api/v3/"community/delete")
  public suspend fun deleteCommunity(@Body form: DeleteCommunity): CommunityResponse

  @POST(api/v3/"community/remove")
  public suspend fun removeCommunity(@Body form: RemoveCommunity): CommunityResponse

  @POST(api/v3/"community/transfer")
  public suspend fun transferCommunity(@Body form: TransferCommunity): GetCommunityResponse

  @POST(api/v3/"community/ban_user")
  public suspend fun banFromCommunity(@Body form: BanFromCommunity): BanFromCommunityResponse

  @POST(api/v3/"community/mod")
  public suspend fun addModToCommunity(@Body form: AddModToCommunity): AddModToCommunityResponse

  @POST(api/v3/"post")
  public suspend fun createPost(@Body form: CreatePost): PostResponse

  @GET(api/v3/"post")
  public suspend fun getPost(
    @Query("id") id: PostId?,
    @Query("comment_id") commentId: CommentId?,
    @Query("auth") auth: String?,
  ): GetPostResponse

  @PUT(api/v3/"post")
  public suspend fun editPost(@Body form: EditPost): PostResponse

  @POST(api/v3/"post/delete")
  public suspend fun deletePost(@Body form: DeletePost): PostResponse

  @POST(api/v3/"post/remove")
  public suspend fun removePost(@Body form: RemovePost): PostResponse

  @POST(api/v3/"post/mark_as_read")
  public suspend fun markPostAsRead(@Body form: MarkPostAsRead): PostResponse

  @POST(api/v3/"post/lock")
  public suspend fun lockPost(@Body form: LockPost): PostResponse

  @POST(api/v3/"post/feature")
  public suspend fun featurePost(@Body form: FeaturePost): PostResponse

  @GET(api/v3/"post/list")
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

  @POST(api/v3/"post/like")
  public suspend fun likePost(@Body form: CreatePostLike): PostResponse

  @PUT(api/v3/"post/save")
  public suspend fun savePost(@Body form: SavePost): PostResponse

  @POST(api/v3/"post/report")
  public suspend fun createPostReport(@Body form: CreatePostReport): PostReportResponse

  @PUT(api/v3/"post/report/resolve")
  public suspend fun resolvePostReport(@Body form: ResolvePostReport): PostReportResponse

  @GET(api/v3/"post/report/list")
  public suspend fun listPostReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListPostReportsResponse

  @GET(api/v3/"post/site_metadata")
  public suspend fun getSiteMetadata(@Query("url") url: String): GetSiteMetadataResponse

  @POST(api/v3/"comment")
  public suspend fun createComment(@Body form: CreateComment): CommentResponse

  @PUT(api/v3/"comment")
  public suspend fun editComment(@Body form: EditComment): CommentResponse

  @POST(api/v3/"comment/delete")
  public suspend fun deleteComment(@Body form: DeleteComment): CommentResponse

  @POST(api/v3/"comment/remove")
  public suspend fun removeComment(@Body form: RemoveComment): CommentResponse

  @POST(api/v3/"comment/mark_as_read")
  public suspend fun markCommentReplyAsRead(@Body form: MarkCommentReplyAsRead):
      CommentReplyResponse

  @POST(api/v3/"comment/like")
  public suspend fun likeComment(@Body form: CreateCommentLike): CommentResponse

  @PUT(api/v3/"comment/save")
  public suspend fun saveComment(@Body form: SaveComment): CommentResponse

  @POST(api/v3/"comment/distinguish")
  public suspend fun distinguishComment(@Body form: DistinguishComment): CommentResponse

  @GET(api/v3/"comment/list")
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

  @GET(api/v3/"comment")
  public suspend fun getComment(@Query("id") id: CommentId, @Query("auth") auth: String?):
      CommentResponse

  @POST(api/v3/"comment/report")
  public suspend fun createCommentReport(@Body form: CreateCommentReport): CommentReportResponse

  @PUT(api/v3/"comment/report/resolve")
  public suspend fun resolveCommentReport(@Body form: ResolveCommentReport): CommentReportResponse

  @GET(api/v3/"comment/report/list")
  public suspend fun listCommentReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("community_id") communityId: CommunityId?,
    @Query("auth") auth: String,
  ): ListCommentReportsResponse

  @GET(api/v3/"private_message/list")
  public suspend fun getPrivateMessages(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): PrivateMessagesResponse

  @POST(api/v3/"private_message")
  public suspend fun createPrivateMessage(@Body form: CreatePrivateMessage): PrivateMessageResponse

  @PUT(api/v3/"private_message")
  public suspend fun editPrivateMessage(@Body form: EditPrivateMessage): PrivateMessageResponse

  @POST(api/v3/"private_message/delete")
  public suspend fun deletePrivateMessage(@Body form: DeletePrivateMessage): PrivateMessageResponse

  @POST(api/v3/"private_message/mark_as_read")
  public suspend fun markPrivateMessageAsRead(@Body form: MarkPrivateMessageAsRead):
      PrivateMessageResponse

  @POST(api/v3/"private_message/report")
  public suspend fun createPrivateMessageReport(@Body form: CreatePrivateMessageReport):
      PrivateMessageReportResponse

  @PUT(api/v3/"private_message/report/resolve")
  public suspend fun resolvePrivateMessageReport(@Body form: ResolvePrivateMessageReport):
      PrivateMessageReportResponse

  @GET(api/v3/"private_message/report/list")
  public suspend fun listPrivateMessageReports(
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unresolved_only") unresolvedOnly: Boolean?,
    @Query("auth") auth: String,
  ): ListPrivateMessageReportsResponse

  @POST(api/v3/"user/register")
  public suspend fun register(@Body form: Register): LoginResponse

  @POST(api/v3/"user/login")
  public suspend fun login(@Body form: Login): LoginResponse

  @GET(api/v3/"user")
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

  @GET(api/v3/"user/mention")
  public suspend fun getPersonMentions(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetPersonMentionsResponse

  @POST(api/v3/"user/mention/mark_as_read")
  public suspend fun markPersonMentionAsRead(@Body form: MarkPersonMentionAsRead):
      PersonMentionResponse

  @GET(api/v3/"user/replies")
  public suspend fun getReplies(
    @Query("sort") sort: CommentSortType?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("auth") auth: String,
  ): GetRepliesResponse

  @POST(api/v3/"user/ban")
  public suspend fun banPerson(@Body form: BanPerson): BanPersonResponse

  @GET(api/v3/"user/banned")
  public suspend fun getBannedPersons(@Query("auth") auth: String): BannedPersonsResponse

  @POST(api/v3/"user/block")
  public suspend fun blockPerson(@Body form: BlockPerson): BlockPersonResponse

  @GET(api/v3/"user/get_captcha")
  public suspend fun getCaptcha(@Query("auth") auth: String?): GetCaptchaResponse

  @POST(api/v3/"user/delete_account")
  public suspend fun deleteAccount(@Body form: DeleteAccount): DeleteAccountResponse

  @POST(api/v3/"user/password_reset")
  public suspend fun passwordReset(@Body form: PasswordReset): PasswordResetResponse

  @POST(api/v3/"user/password_change")
  public suspend fun passwordChangeAfterReset(@Body form: PasswordChangeAfterReset): LoginResponse

  @POST(api/v3/"user/mark_all_as_read")
  public suspend fun markAllAsRead(@Body form: MarkAllAsRead): GetRepliesResponse

  @PUT(api/v3/"user/save_user_settings")
  public suspend fun saveUserSettings(@Body form: SaveUserSettings): LoginResponse

  @PUT(api/v3/"user/change_password")
  public suspend fun changePassword(@Body form: ChangePassword): LoginResponse

  @GET(api/v3/"user/report_count")
  public suspend fun getReportCount(@Query("community_id") communityId: CommunityId?, @Query("auth")
      auth: String): GetReportCountResponse

  @GET(api/v3/"user/unread_count")
  public suspend fun getUnreadCount(@Query("auth") auth: String): GetUnreadCountResponse

  @POST(api/v3/"user/verify_email")
  public suspend fun verifyEmail(@Body form: VerifyEmail): VerifyEmailResponse

  @POST(api/v3/"admin/add")
  public suspend fun addAdmin(@Body form: AddAdmin): AddAdminResponse

  @GET(api/v3/"admin/registration_application/count")
  public suspend fun getUnreadRegistrationApplicationCount(@Query("auth") auth: String):
      GetUnreadRegistrationApplicationCountResponse

  @GET(api/v3/"admin/registration_application/list")
  public suspend fun listRegistrationApplications(
    @Query("unread_only") unreadOnly: Boolean?,
    @Query("page") page: Long?,
    @Query("limit") limit: Long?,
    @Query("auth") auth: String,
  ): ListRegistrationApplicationsResponse

  @PUT(api/v3/"admin/registration_application/approve")
  public suspend fun approveRegistrationApplication(@Body form: ApproveRegistrationApplication):
      RegistrationApplicationResponse

  @POST(api/v3/"admin/purge/person")
  public suspend fun purgePerson(@Body form: PurgePerson): PurgeItemResponse

  @POST(api/v3/"admin/purge/community")
  public suspend fun purgeCommunity(@Body form: PurgeCommunity): PurgeItemResponse

  @POST(api/v3/"admin/purge/post")
  public suspend fun purgePost(@Body form: PurgePost): PurgeItemResponse

  @POST(api/v3/"admin/purge/comment")
  public suspend fun purgeComment(@Body form: PurgeComment): PurgeItemResponse

  @POST(api/v3/"custom_emoji")
  public suspend fun createCustomEmoji(@Body form: CreateCustomEmoji): CustomEmojiResponse

  @PUT(api/v3/"custom_emoji")
  public suspend fun editCustomEmoji(@Body form: EditCustomEmoji): CustomEmojiResponse

  @POST(api/v3/"custom_emoji/delete")
  public suspend fun deleteCustomEmoji(@Body form: DeleteCustomEmoji): DeleteCustomEmojiResponse

  @GET(api/v3/"federated_instances")
  public suspend fun getFederatedInstances(@Query("auth") auth: String?):
      GetFederatedInstancesResponse
}
