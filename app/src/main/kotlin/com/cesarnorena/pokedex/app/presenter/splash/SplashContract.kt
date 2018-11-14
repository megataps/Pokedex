package com.cesarnorena.pokedex.app.presenter.splash

interface SplashContract {

    interface View {
        fun navigateToPokemonList()
    }

    interface Presenter {
        fun onCreateView(view: View)
        fun onDestroyView()
    }
}
