package android.template.data.network

import android.template.data.datasource.CatsDataSource
import javax.inject.Inject
import javax.inject.Singleton

interface CatsRepository{

    suspend fun getCats(apiKey: String):Result<Cats>
}