package com.cesarnorena.pokedex.domain.repository.injection

import com.cesarnorena.pokedex.data.repository.DefaultLocalRepository
import com.cesarnorena.pokedex.data.repository.DefaultRemoteRepository
import com.cesarnorena.pokedex.data.repository.remote.BASE_URL
import com.cesarnorena.pokedex.data.repository.remote.PokemonService
import com.cesarnorena.pokedex.data.repository.remote.client.createRemoteService
import com.cesarnorena.pokedex.domain.repository.LocalRepository
import com.cesarnorena.pokedex.domain.repository.RemoteRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class LocalModule {

    @Binds
    abstract fun bindLocalRepository(
        defaultLocalRepository: DefaultLocalRepository
    ): LocalRepository
}

@Module
class RemoteModule {

    @Provides
    fun providePokemonService(): PokemonService {
        return createRemoteService(BASE_URL)
    }

    @Provides
    fun provideRemoteService(pokemonService: PokemonService): RemoteRepository {
        return DefaultRemoteRepository(pokemonService)
    }
}
