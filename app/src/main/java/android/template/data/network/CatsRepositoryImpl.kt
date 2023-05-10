package android.template.data.network

import android.template.data.api.CatResponseDTO
import android.template.data.api.CatsApi
import android.template.data.api.CatsResponseDTO


class CatsRepositoryImpl(private val catsApi: CatsApi) : CatsRepository {
    override suspend fun getCats(apiKey: String): Result<List<Cats>> {
        return try {
            val response = catsApi.getCats(apiKey).body()
            if (response != null) {
                Result.success(response.map { it.toCats() })
            } else {
                Result.failure(Exception("Empty response"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }


}

private fun CatsResponseDTO.toCats(): Cats =
    Cats(
        cats = this.cats.map { it.toCat() }
    )

private fun CatResponseDTO.toCat(): Cat =
    Cat(
        breedName = this.breedName,
        origin = origin,
        affectionLevel = affectionLevel,
        intelligence = intelligence,
        imageUlr = imageUlr

    )
