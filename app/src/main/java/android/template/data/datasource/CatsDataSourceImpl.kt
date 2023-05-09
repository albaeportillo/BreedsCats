package android.template.data.datasource

import android.template.data.network.Cats
import javax.inject.Inject

class CatsDataSourceImpl @Inject constructor(): CatsDataSource {
    override suspend fun cats(): List<Cats> {
        TODO("Not yet implemented")
    }

    override suspend fun getCats(): Cats {
        TODO("Not yet implemented")
    }
}