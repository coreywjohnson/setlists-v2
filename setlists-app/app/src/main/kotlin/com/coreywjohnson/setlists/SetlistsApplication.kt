package com.coreywjohnson.setlists

import android.app.Application

class SetlistsApplication : Application() {

  lateinit var applicationComponent: ApplicationComponent

  override fun onCreate() {
    super.onCreate()
    applicationComponent = DaggerApplicationComponent.builder()
        .application(this)
        .build()
  }
}