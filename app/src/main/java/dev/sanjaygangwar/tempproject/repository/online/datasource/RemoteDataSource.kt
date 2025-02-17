package dev.sanjaygangwar.tempproject.repository.online.datasource

import dev.sanjaygangwar.tempproject.models.data.GetAllCharacterDataClass
import dev.sanjaygangwar.tempproject.repository.online.api.APIService
import dev.sanjaygangwar.tempproject.repository.sharedpreferences.AppSharePreference
import dev.sanjaygangwar.tempproject.utils.network.retrofit.BaseDataSource
import dev.sanjaygangwar.tempproject.utils.network.retrofit.Resource
import javax.inject.Inject

class RemoteDataSource  @Inject constructor(
    private val APIService: APIService,
    private val sharedPreferences: AppSharePreference
) : BaseDataSource() {

    suspend fun getAllCharacter(): Resource<GetAllCharacterDataClass> = getResult {
        APIService.getAllCharacters()
    }
}