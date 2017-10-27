package co.cesarnorena.pokedex.data.model

import co.cesarnorena.pokedex.data.remote.PokemonService
import com.google.gson.annotations.SerializedName

data class PokedexEntry(@SerializedName("entry_number") val number: Int,
                        @SerializedName("pokemon_species") val specie: Specie) {

    val imageUrl: String get() = PokemonService.getShortImageUrl(Pokemon.getFormattedId(number))

}
