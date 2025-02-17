package dev.sanjaygangwar.tempproject.repository.online.api

import dev.sanjaygangwar.tempproject.models.data.GetAllCharacterDataClass
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("characters")
    suspend fun getAllCharacters(): Response<GetAllCharacterDataClass>
}