package com.cesarnorena.pokedex.app.presenter.detail

import com.cesarnorena.pokedex.data.model.Pokemon

interface PokemonDetailContract {

    interface View {
        fun updatePokemonData(pokemon: Pokemon)
        fun showProgress(show: Boolean)
    }

    interface Presenter {
        fun onCreateView(view: View, pokemonId: Int)
        fun onDestroyView()
    }
}
