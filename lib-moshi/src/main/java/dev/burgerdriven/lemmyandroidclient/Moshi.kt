package dev.burgerdriven.lemmyandroidclient

import com.squareup.moshi.Moshi
import dev.burgerdriven.lemmyandroidclient.hotfix.ListingTypeHotfix
import dev.burgerdriven.lemmyandroidclient.hotfix.RegistrationModeHotfix
import dev.burgerdriven.lemmyandroidclient.hotfix.SortTypeHotfix

/**
 * Applies hotfixes so that Moshi can properly (de)serialize JSON responses from Lemmy.
 */
fun Moshi.Builder.addLemmyHotfixAdapters(): Moshi.Builder =
    this.add(RegistrationModeHotfix())
        .add(ListingTypeHotfix())
        .add(SortTypeHotfix())
