package io.jeph.haiku.configuration

import io.jeph.haiku.repository.HaikuRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {

    @Bean
    fun createRepository(): HaikuRepository {
        return HaikuRepository()
    }


}