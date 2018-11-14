package com.cesarnorena.pokedex.data.model

import com.cesarnorena.pokedex.app.extensions.formattedId
import com.cesarnorena.pokedex.data.repository.remote.PokemonService
import com.google.gson.annotations.SerializedName

data class PokedexEntry(
    @SerializedName("entry_number") val number: Int,
    @SerializedName("pokemon_species") val specie: Specie
) {
    val imageUrl: String get() = PokemonService.getShortImageUrl(number.formattedId())
}
