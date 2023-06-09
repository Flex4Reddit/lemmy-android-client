package net.codefeet.lemmyandroidclient.hotfix

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson
import net.codefeet.lemmyandroidclient.gen.types.ListingType

/**
 * Lemmy may send integers as ListingType.
 *
 * eg: GET /site my_user.local_user_view.local_user.default_listing_type
 */
class ListingTypeHotfix {
  companion object {
    private val enums = ListingType.values()
  }
  
  @ToJson
  fun toJson(@FixListingType it: ListingType) = it.ordinal
  
  @FromJson
  @FixListingType
  fun fromJson(it: Int) = enums[it]
}

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class FixListingType
