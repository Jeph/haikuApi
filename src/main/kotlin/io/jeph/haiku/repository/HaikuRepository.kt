package io.jeph.haiku.repository

import io.jeph.haiku.domain.Haiku

class HaikuRepository: Repository {

    var haikus = mutableListOf<Haiku>()

    override fun store(haiku: Haiku){
        haikus.add(haiku)
    }

    override fun getAllHaikus(): MutableList<Haiku> {
        return haikus
    }

}