package net.codefeet.lemmyandroidclient

import com.squareup.moshi.Moshi
import net.codefeet.lemmyandroidclient.hotfix.ListingTypeHotfix
import net.codefeet.lemmyandroidclient.hotfix.RegistrationModeHotfix
import net.codefeet.lemmyandroidclient.hotfix.SortTypeHotfix

/**
 * Applies hotfixes so that Moshi can properly (de)serialize JSON responses from Lemmy.
 */
fun Moshi.Builder.addLemmyHotfixAdapters(): Moshi.Builder =
    this.add(RegistrationModeHotfix())
        .add(ListingTypeHotfix())
        .add(SortTypeHotfix())
