package dev.burgerdriven.lemmyandroidclient.hotfix

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import dev.burgerdriven.lemmyandroidclient.gen.types.SortType
import java.lang.reflect.Type

/**
 * Lemmy may send integers as ListingType.
 *
 * eg: GET /site my_user.local_user_view.local_user.default_listing_type
 */
class SortTypeHotfix : JsonDeserializer<SortType> {
  companion object {
    private val enums = SortType.values()
  }
  
  override fun deserialize(
      json: JsonElement,
      typeOfT: Type,
      context: JsonDeserializationContext,
  ): SortType {
    return if (json.asJsonPrimitive.isNumber) enums[json.asInt]
    else enumValueOf(json.asString)
  }
}
