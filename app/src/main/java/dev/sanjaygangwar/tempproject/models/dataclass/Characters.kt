package dev.sanjaygangwar.tempproject.models.dataclass

import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Serializable
data class ChapterTwo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val location: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
)