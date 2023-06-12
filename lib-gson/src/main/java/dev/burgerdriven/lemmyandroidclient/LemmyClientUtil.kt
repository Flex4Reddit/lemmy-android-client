package dev.burgerdriven.lemmyandroidclient

import com.google.gson.GsonBuilder
import dev.burgerdriven.lemmyandroidclient.gen.types.ListingType
import dev.burgerdriven.lemmyandroidclient.gen.types.RegistrationMode
import dev.burgerdriven.lemmyandroidclient.gen.types.SortType
import dev.burgerdriven.lemmyandroidclient.hotfix.ListingTypeHotfix
import dev.burgerdriven.lemmyandroidclient.hotfix.RegistrationModeHotfix
import dev.burgerdriven.lemmyandroidclient.hotfix.SortTypeHotfix

fun GsonBuilder.addLemmyHotfixAdapters(): GsonBuilder =
    this.registerTypeAdapter(RegistrationMode::class.java, RegistrationModeHotfix())
        .registerTypeAdapter(ListingType::class.java, ListingTypeHotfix())
        .registerTypeAdapter(SortType::class.java, SortTypeHotfix())
