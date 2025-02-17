package dev.sanjaygangwar.tempproject.models.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Serializable
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