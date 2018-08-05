package io.jeph.haiku.configuration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("io.jeph.haiku"))
class HaikuApplication
fun main(args: Array<String>) {
    runApplication<HaikuApplication>(*args)
}
