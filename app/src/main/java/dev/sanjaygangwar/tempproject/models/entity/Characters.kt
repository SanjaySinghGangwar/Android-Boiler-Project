package dev.sanjaygangwar.tempproject.models.entity

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
@Entity(tableName = "characters")
data class Characters(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val location: String,
    val name: String,
    val origin: String,
    val species: String,
    val status: String
) : Parcelable