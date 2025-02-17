package dev.sanjaygangwar.tempproject.repository.offline.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import dev.sanjaygangwar.tempproject.models.entity.Characters


@Dao
interface mainDao {
    // Function to get all characters from the local database
    @Query("SELECT * FROM characters")
    fun getAllCharacters(): LiveData<List<Characters>>

    // Function to insert all characters into the local database
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<Characters>)

    // Optionally, you can add additional methods like deleting all characters
    // @Query("DELETE FROM characters")
    // suspend fun deleteAll()
}