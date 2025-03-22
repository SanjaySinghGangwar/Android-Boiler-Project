package dev.sanjaygangwar.tempproject.repository.online.api

import dev.sanjaygangwar.tempproject.models.data.EmployeeModel
import dev.sanjaygangwar.tempproject.models.data.GetAllCharacterDataClass
import retrofit2.Response
import retrofit2.http.GET

interface APIService {

    @GET("characters")
    suspend fun getAllCharacters(): Response<GetAllCharacterDataClass>

    @GET("v1/employees")
    suspend fun getAllEmployee(): Response<EmployeeModel>
}