package io.jeph.haiku.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import io.jeph.haiku.domain.Haiku
import io.jeph.haiku.repository.HaikuRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI


@RestController
class HaikuController(
        private val haikuRepository: HaikuRepository
) {

    @PostMapping("/createHaiku")
    fun createHaiku(
            @RequestBody body: String
    ): ResponseEntity<String> {

        val json = ObjectMapper().readTree(body)

        haikuRepository.store(
                Haiku(
                        lineOne = json.get("0").asText(),
                        lineTwo = json.get("1").asText(),
                        lineThree = json.get("2").asText()

                )
        )

        return ResponseEntity.created(URI.create("")).build()
    }

    @GetMapping("/haikus")
    fun getHaikus(): MutableList<Haiku> {

        val haikus = haikuRepository.getAllHaikus()

        return haikus

    }

    @RequestMapping("/")
    fun home(): String {

        return "Welcome to Haikus"

    }
}

