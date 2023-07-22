package com.stringsattached.chatgpt.api

import com.stringsattached.chatgpt.model.ChatGPTResponse
import retrofit2.Response
import retrofit2.http.POST

const val chatApi: String = "https://api.openai.com/v1/chat/completions"

interface ChatGPTAPI {

    @POST(value = chatApi)
    suspend fun getResponse(): Response<ChatGPTResponse>
}
