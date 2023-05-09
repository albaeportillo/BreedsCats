package android.template.data.remote

import android.template.data.api.CatsApi
import android.template.data.network.Cats

class CatsRemoteImpl(private val catsApi: CatsApi): CatsRemote {
    override suspend fun getCats(apiKey: String): Result<Cats> {
        return try {
            Result.success( catsApi.getCats(apiKey)
        }catch (e: Exception) {
            Result.failure(e)
        }

    }
}