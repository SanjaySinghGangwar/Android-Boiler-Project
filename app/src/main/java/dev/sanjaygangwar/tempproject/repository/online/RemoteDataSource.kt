package dev.sanjaygangwar.tempproject.repository.online

import dev.sanjaygangwar.tempproject.models.dataclass.GetAllCharacterDataClass
import dev.sanjaygangwar.tempproject.repository.sharedpreferences.AppSharePreference
import dev.sanjaygangwar.tempproject.utils.retrofit.BaseDataSource
import dev.sanjaygangwar.tempproject.utils.retrofit.Resource
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource  @Inject constructor(
    private val APIService: APIService,
    private val sharedPreferences: AppSharePreference
) : BaseDataSource() {

    suspend fun getAllCharacter(): Resource<GetAllCharacterDataClass> = getResult {
        APIService.getAllCharacters()
    }
}