package android.template.data.remote

import android.template.data.network.Cats

interface CatsRemote {

    suspend fun getCats(apiKey: String):Result<Cats>
}