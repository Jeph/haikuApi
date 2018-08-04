package controllers

import io.jeph.haiku.controllers.HaikuController
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.http.MediaType

class HaikuControllerTest {

    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun setup(){

        val haikuController = HaikuController()

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