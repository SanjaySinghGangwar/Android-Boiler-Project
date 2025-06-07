package dev.sanjaygangwar.tempproject.models.data

data class VideoModelData(
    val data: Data,
    val message: String,
    val status: Boolean
) {
    data class Data(
        val licenseUri: String,
        val mediaUrl: String
    )
}

