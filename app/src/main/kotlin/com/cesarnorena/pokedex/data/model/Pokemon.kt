package com.cesarnorena.pokedex.data.model

import com.cesarnorena.pokedex.app.extensions.formattedId
import com.cesarnorena.pokedex.data.repository.remote.PokemonService
import com.google.gson.annotations.SerializedName

data class Pokemon(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("types") val types: List<PokemonType>
) {
    val imageUrl: String get() = PokemonService.getLargeImageUrl(id.formattedId())
}

data class PokemonType(
    @SerializedName("slot") val position: Int,
    @SerializedName("type") val type: Type
)

data class Type(
    @SerializedName("name") val name: String
)
