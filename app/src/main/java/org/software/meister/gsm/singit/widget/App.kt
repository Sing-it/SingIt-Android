package org.software.meister.gsm.singit.widget

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.software.meister.gsm.singit.di.viewModelModules

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                viewModelModules
            )
        }
    }
}