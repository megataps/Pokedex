package com.cesarnorena.pokedex.app.presenter.splash.injection

import com.cesarnorena.pokedex.app.injection.ActivityScoped
import com.cesarnorena.pokedex.app.presenter.splash.SplashContract
import com.cesarnorena.pokedex.app.presenter.splash.SplashPresenter
import dagger.Binds
import dagger.Module

@Module
abstract class SplashModule {

    @ActivityScoped
    @Binds
    abstract fun bindSplashPresenter(splashPresenter: SplashPresenter): SplashContract.Presenter
}
