package com.coreywjohnson.setlists

import android.app.Application
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
      ApplicationModule::class
    ]
)
interface ApplicationComponent {

  fun inject(mainActivity: MainActivity)

  @Component.Builder
  interface Builder {

    @BindsInstance
    fun application(application: Application): Builder

    fun build(): ApplicationComponent
  }
}