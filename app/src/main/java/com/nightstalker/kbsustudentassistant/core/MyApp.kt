package com.nightstalker.kbsustudentassistant.core

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Класс приложения
 *
 * @author Tamerlan Mamukhov on 2022-05-31
 * todo Добавить зависимости когда будут
 */
class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApp)
//            modules()
        }
    }
}