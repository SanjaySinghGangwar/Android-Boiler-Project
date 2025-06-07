package dev.sanjaygangwar.tempproject.repository.online.api

import dev.sanjaygangwar.tempproject.models.data.GetAllCharacterDataClass
import dev.sanjaygangwar.tempproject.models.data.VideoModelData
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("characters")
    suspend fun getAllCharacters(): Response<GetAllCharacterDataClass>

    @GET("teleparty")
    suspend fun getVideoData(): Response<VideoModelData>
}