package com.cesarnorena.pokedex.app.presenter.home.injection

import com.cesarnorena.pokedex.app.injection.ActivityScoped
import com.cesarnorena.pokedex.app.injection.FragmentScoped
import com.cesarnorena.pokedex.app.presenter.detail.PokemonDetailContract
import com.cesarnorena.pokedex.app.presenter.detail.PokemonDetailFragment
import com.cesarnorena.pokedex.app.presenter.detail.PokemonDetailPresenter
import com.cesarnorena.pokedex.app.presenter.home.HomeContract
import com.cesarnorena.pokedex.app.presenter.home.HomePresenter
import com.cesarnorena.pokedex.app.presenter.list.PokemonListContract
import com.cesarnorena.pokedex.app.presenter.list.PokemonListFragment
import com.cesarnorena.pokedex.app.presenter.list.PokemonListPresenter
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class HomeModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun pokemonListFragment(): PokemonListFragment

    @FragmentScoped
    @ContributesAndroidInjector
    abstract fun pokemonDetailFragment(): PokemonDetailFragment

    @ActivityScoped
    @Binds
    abstract fun bindHomePresenter(presenter: HomePresenter): HomeContract.Presenter

    @FragmentScoped
    @Binds
    abstract fun bindPokemonListPresenter(
        PokemonListPresenter: PokemonListPresenter
    ): PokemonListContract.Presenter

    @FragmentScoped
    @Binds
    abstract fun bindPokemonDetailPresenter(
        pokemonDetailPresenter: PokemonDetailPresenter
    ): PokemonDetailContract.Presenter
}
