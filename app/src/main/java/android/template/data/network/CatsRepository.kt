package android.template.data.network

interface CatsRepository {

    suspend fun getCats(apiKey: String): Result<List<Cats>>
}