package android.template.data.api

import com.google.gson.annotations.SerializedName

data class CatsResponseDTO (
    val cats: List<CatResponseDTO>
)

data class CatResponseDTO(
    @SerializedName("name")
    val breedName: String,
    val origin: String,
    @SerializedName("naffection_level")
    val affectionLevel: Int,
    val intelligence: Int,
    val imageUlr: String
)