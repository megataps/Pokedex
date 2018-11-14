package com.cesarnorena.pokedex.domain.usecases

import com.cesarnorena.pokedex.domain.repository.LocalRepository
import com.cesarnorena.pokedex.domain.repository.RemoteRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class FetchPokedex @Inject constructor(
    private val remoteRepository: RemoteRepository,
    private val localRepository: LocalRepository
) {
    operator fun invoke(id: Int): Single<Boolean> {
        return remoteRepository.getPokedex(id)
            .flatMap { pokedex ->
                localRepository.savePokedex(pokedex.pokedexEntries)
                    .map { true }
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}
