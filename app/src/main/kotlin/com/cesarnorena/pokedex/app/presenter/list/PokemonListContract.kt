package com.cesarnorena.pokedex.app.presenter.list

import com.cesarnorena.pokedex.data.model.PokedexEntry

interface PokemonListContract {

    interface View {
        fun setupList(pokemonList: List<PokedexEntry>)
        fun navigatePokemonDetail(pokemonId: Int)
        fun showNoInternetMessage(show: Boolean)
    }

    interface Presenter {
        fun onCreateView(view: View)
        fun onDestroyView()
        fun onPokemonItemClick(pokemonId: Int)
    }
}
