package dev.sanjaygangwar.tempproject.models.data

import dev.sanjaygangwar.tempproject.models.entity.Characters

data class GetAllCharacterDataClass(
    val data: List<Characters>,
    val message: String,
    val status: Boolean
)

