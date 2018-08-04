package io.jeph.haiku.configuration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class HaikuApplication
fun main(args: Array<String>) {
    runApplication<HaikuApplication>(*args)
}
