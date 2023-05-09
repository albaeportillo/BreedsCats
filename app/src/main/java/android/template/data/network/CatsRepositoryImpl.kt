package android.template.data.network

import android.template.data.api.CatsApi
import android.template.data.datasource.CatsDataSource
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton


class CatsRepositoryImpl (private val catsApi: CatsApi): CatsRepository {
    override suspend fun getCats(apiKey: String): Result<Cats> {
        return try {
            Result.success(catsApi.getCats(apiKey).toCats())
        }catch (e: Exception) {
            Result.failure(e)
        }
    }
}

private fun <T> Response<T>.toCats(): Cats {
    return Cats(th)

}
