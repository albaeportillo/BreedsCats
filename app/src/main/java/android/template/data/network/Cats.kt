package android.template.data.network

data class Cat(
    val breedName: String,
    val origin: String,
    val affectionLevel: Int,
    val intelligence: Int,
    val imageUlr: String
)

data class Cats(
    val cats: List<Cat>
)