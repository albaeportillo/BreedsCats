package android.template.data.remote

import android.template.data.api.CatResponseDTO
import android.template.data.api.CatsApi
import android.template.data.api.CatsResponseDTO
import android.template.data.network.Cat
import android.template.data.network.Cats

class CatsRemoteImpl(private val catsApi: CatsApi): CatsRemote {
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