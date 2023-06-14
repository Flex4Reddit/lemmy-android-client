package net.codefeet.lemmyandroidclient

import com.google.gson.GsonBuilder
import net.codefeet.lemmyandroidclient.gen.types.ListingType
import net.codefeet.lemmyandroidclient.gen.types.RegistrationMode
import net.codefeet.lemmyandroidclient.gen.types.SortType
import net.codefeet.lemmyandroidclient.hotfix.ListingTypeHotfix
import net.codefeet.lemmyandroidclient.hotfix.RegistrationModeHotfix
import net.codefeet.lemmyandroidclient.hotfix.SortTypeHotfix

fun GsonBuilder.addLemmyHotfixAdapters(): GsonBuilder =
    this.registerTypeAdapter(RegistrationMode::class.java, RegistrationModeHotfix())
        .registerTypeAdapter(ListingType::class.java, ListingTypeHotfix())
        .registerTypeAdapter(SortType::class.java, SortTypeHotfix())
