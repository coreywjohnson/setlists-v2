package com.coreywjohnson.setlists

import android.app.Application
import com.coreywjohnson.setlists.api.SetlistApiModule
import com.coreywjohnson.setlists.networking.NetworkingModule
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
      ApplicationModule::class,
      NetworkingModule::class,
      SetlistApiModule::class
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