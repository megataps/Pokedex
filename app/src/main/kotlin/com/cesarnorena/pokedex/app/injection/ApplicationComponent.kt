package com.cesarnorena.pokedex.app.injection

import android.app.Application
import com.cesarnorena.pokedex.app.PokemonApplication
import com.cesarnorena.pokedex.domain.repository.injection.LocalModule
import com.cesarnorena.pokedex.domain.repository.injection.RemoteModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    RemoteModule::class,
    LocalModule::class,
    ActivityBindingModule::class,
    FragmentBindingModule::class,
    ApplicationModule::class,
    AndroidSupportInjectionModule::class
])
interface ApplicationComponent : AndroidInjector<PokemonApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }
}
