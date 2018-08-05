package io.jeph.haiku.repository

import io.jeph.haiku.domain.Haiku


interface Repository {

    fun store(haiku: Haiku)

    fun getAllHaikus(): MutableList<Haiku>

}
