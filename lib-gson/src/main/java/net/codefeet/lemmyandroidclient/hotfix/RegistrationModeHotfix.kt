package net.codefeet.lemmyandroidclient.hotfix

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonPrimitive
import com.google.gson.JsonSerializationContext
import com.google.gson.JsonSerializer
import net.codefeet.lemmyandroidclient.gen.types.RegistrationMode
import java.lang.reflect.Type

/**
 * Lemmy does not capitalize RegistrationMode values.
 *
 * eg: GET /site site_view.local_site.registration_mode
 */
class RegistrationModeHotfix : JsonSerializer<RegistrationMode>, JsonDeserializer<RegistrationMode> {
  companion object {
    private val enums = RegistrationMode.values().associateBy { it.name.lowercase() }
  }
  
  override fun serialize(
      src: RegistrationMode,
      typeOfSrc: Type,
      context: JsonSerializationContext,
  ) = JsonPrimitive(src.name.lowercase())
  
  override fun deserialize(
      json: JsonElement,
      typeOfT: Type,
      context: JsonDeserializationContext,
  ) = enums[json.asString.lowercase()]
}
