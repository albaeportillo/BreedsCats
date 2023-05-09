package android.template.data.api

import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataApiModule {

    fun init() {
        loadKoinModules(
            listOf(
                remoteModule
            )
        )
    }

   private val remoteModule: Module by lazy {
        module {
            single {
                Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.thecatapi.com/v1/")
                    .build()
            }
            single { get<Retrofit>().create(CatsApi::class.java) }
        }
    }
}