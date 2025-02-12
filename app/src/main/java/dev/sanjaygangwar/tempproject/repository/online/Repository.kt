package dev.sanjaygangwar.tempproject.repository.online

import dev.sanjaygangwar.tempproject.models.dataclass.GetAllCharacterDataClass
import dev.sanjaygangwar.tempproject.repository.offline.dao.mainDao
import dev.sanjaygangwar.tempproject.utils.retrofit.Resource
import dev.sanjaygangwar.tempproject.utils.retrofit.operations.performGetOperation
import javax.inject.Inject

class Repository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: mainDao
) {

    fun getAllCharacter() = performGetOperation(
        databaseQuery = { localDataSource.getAllCharacters() },
        networkCall = { remoteDataSource.getAllCharacter() },
        saveCallResult = { it.data.let { networkResponse -> localDataSource.insertAll(networkResponse) } }
    )

}