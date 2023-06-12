package dev.burgerdriven.lemmyandroidclient.hotfix

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import java.lang.reflect.Type

/**
 * Lemmy may send integers as ListingType.
 *
 * eg: GET /site my_user.local_user_view.local_user.default_listing_type
 */
class ListingTypeHotfix : JsonDeserializer<ListingType> {
  companion object {
    private val enums = ListingType.values()
  }
  
  override fun deserialize(
      json: JsonElement,
      typeOfT: Type,
      context: JsonDeserializationContext,
  ) = when {
    json.asJsonPrimitive.isNumber -> enums[json.asInt]
    else -> enumValueOf(json.asString)
  }
}
