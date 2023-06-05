package dev.burgerdriven.lemmyandroidclient.hotfix

import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import dev.burgerdriven.lemmyandroidclient.gen.types.RegistrationMode

/**
 * Lemmy does not capitalize RegistrationMode values.
 */
class RegistrationModeHotfix {
  private val enums = RegistrationMode.values().associateBy { it.name.lowercase() }
  
  @ToJson
  fun toJson(it: RegistrationMode) = it.name.lowercase()
  
  @FromJson
  fun fromJson(it: String) = enums[it.lowercase()]
}
