package dev.sanjaygangwar.tempproject.models.dataclass

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

data class GetAllCharacterDataClass(
    val data: List<Characters>,
    val message: String,
    val status: Boolean
)

@Entity(tableName = "characters")
data class Characters(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val location: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
)