package android.template.data.api

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface CatsApi {

    @GET("breeds")
    suspend fun getCats(@Header("x-api-key") apiKey: String): Response<List<CatsResponse>>
}


class CatsResponse {

}
