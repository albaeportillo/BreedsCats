package android.template.data.datasource

import android.template.data.network.Cats

interface CatsDataSource {
    suspend fun cats(): List<Cats>
    suspend fun getCats(): Cats
    // TODO OJO
    //suspend fun saveTasks(tasks: List<NetworkTask>)
}