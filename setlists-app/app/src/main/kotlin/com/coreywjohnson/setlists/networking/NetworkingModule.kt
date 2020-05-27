package com.coreywjohnson.setlists.networking

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class NetworkingModule {

  @Provides
  fun okHttpClient(): OkHttpClient {
    return OkHttpClient.Builder().build()
  }
}