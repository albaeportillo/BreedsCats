/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.template

import android.app.Application
import android.template.data.network.CatsRepository
import android.template.data.network.CatsRepositoryImpl
import dagger.hilt.android.HiltAndroidApp
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.dsl.module

@HiltAndroidApp
class MyApplication : Application() {
    init {
        //instantiateDependencies()
    }
}

private fun instantiateDependencies() {
    startKoin {
        loadKoinModules(
            module {
                single<CatsRepository> {
                    CatsRepositoryImpl("bda53789-d59e-46cd-9bc4-2936630fde39")
                }
            })
    }
}