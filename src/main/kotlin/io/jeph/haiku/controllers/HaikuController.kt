package io.jeph.haiku.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI


@RestController
class HaikuController {

    @PostMapping("createHaiku")
    fun createHaiku(
            @RequestBody body: String
    ): ResponseEntity<String> {




        return ResponseEntity.created(URI.create("")).build()
    }

    @GetMapping("haikus")
    fun getHaikus() {



    }
}

