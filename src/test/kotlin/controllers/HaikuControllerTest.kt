package controllers

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import io.jeph.haiku.controllers.HaikuController
import io.jeph.haiku.domain.Haiku
import io.jeph.haiku.repository.HaikuRepository
import io.jeph.haiku.repository.Repository
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders

class HaikuControllerTest {

    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setup(){

        val haikuController = HaikuController(
                haikuRepository = HaikuRepository()
        )

        mockMvc = MockMvcBuilders
                .standaloneSetup(haikuController)
                .build()

    }

    @Test
    fun `post to createHaiku delegates to usecase and returns 201`(){

        val requestBody = "{\"0\":\"This\",\"1\":\"is\",\"2\":\"not a haiku\"}"

        mockMvc.perform(post("/createHaiku")
                .content(requestBody)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated)

    }

}