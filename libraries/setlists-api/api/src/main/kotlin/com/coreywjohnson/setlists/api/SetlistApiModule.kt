package com.coreywjohnson.setlists.api

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
class SetlistApiModule {

  @Provides
  fun retrofit(
      client: OkHttpClient,
      moshiConverterFactory: MoshiConverterFactory,
      rxJava3CallAdapterFactory: RxJava3CallAdapterFactory
  ): Retrofit {
    return Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(client)
        .addConverterFactory(moshiConverterFactory)
        .addCallAdapterFactory(rxJava3CallAdapterFactory)
        .build()
  }

  @Provides
  fun rxJava3CallAdapterFactory(): RxJava3CallAdapterFactory {
    return RxJava3CallAdapterFactory.create()
  }

  @Provides
  fun moshiConverterFactory():  MoshiConverterFactory {
    return MoshiConverterFactory.create()
  }

  @Provides
  fun setlistService(retrofit: Retrofit) : SetlistService {
    return retrofit.create(SetlistService::class.java)
  }

  companion object {
    const val BASE_URL = "https://api.setlist.fm/rest/"
  }
}