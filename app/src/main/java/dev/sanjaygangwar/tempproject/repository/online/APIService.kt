package dev.sanjaygangwar.tempproject.repository.online

import dev.sanjaygangwar.tempproject.models.dataclass.GetAllCharacterDataClass
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("characters")
    suspend fun getAllCharacters(): Response<GetAllCharacterDataClass>
}