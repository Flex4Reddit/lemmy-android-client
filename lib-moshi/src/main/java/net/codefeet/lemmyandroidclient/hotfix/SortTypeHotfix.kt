package net.codefeet.lemmyandroidclient.hotfix

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson
import net.codefeet.lemmyandroidclient.gen.types.SortType

/**
 * Lemmy may send integers as SortType.
 *
 * eg: GET /site my_user.local_user_view.local_user.default_sort_type
 */
class SortTypeHotfix {
  companion object {
    private val enums = SortType.values()
  }
  
  @ToJson
  fun toJson(@FixSortType it: SortType) = it.ordinal
  
  @FromJson
  @FixSortType
  fun fromJson(it: Int) = enums[it]
}

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class FixSortType
