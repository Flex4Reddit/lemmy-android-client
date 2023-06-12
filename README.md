# lemmy-android-client  [![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

[Retrofit](https://github.com/square/retrofit) bindings
for [Lemmy API](https://github.com/LemmyNet/lemmy) written in Kotlin.

Supports the following JSON parsers:
- [Moshi](https://github.com/square/moshi)
- [Gson](https://github.com/google/gson)

## Install [![](https://jitpack.io/v/Flex4Reddit/lemmy-android-client.svg)](https://jitpack.io/#Flex4Reddit/lemmy-android-client)

```gradle
implementation 'com.github.Flex4Reddit:lemmy-android-client:$VERSION'
```

## Usage

Certain models sent from Lemmy differs from the official `lemmy-js-client`. Hotfix adapters are provided to successfully deserialize server responses.

```kt
val moshi = Moshi.Builder()
    .addLemmyHotfixAdapters()
    .build()

val gson = GsonBuilder()
    .addLemmyHotfixAdapters()
    .create()

val api = Retrofit.Builder()
    .baseUrl("https://lemmy.world/")
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .addConverterFactory(GsonConverterFactory.create(gson))
    .build()
    .create<LemmyApi>()

val site = api.getSite("valid_jwt")
```
