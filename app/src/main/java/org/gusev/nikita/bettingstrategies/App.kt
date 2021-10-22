package org.gusev.nikita.bettingstrategies

import android.app.Application
import android.content.Context
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.gusev.nikita.bettingstrategies.data.local.strategies.StrategiesRepository
import org.gusev.nikita.bettingstrategies.di.mainModule
import org.gusev.nikita.bettingstrategies.di.viewModelsModel
import org.gusev.nikita.bettingstrategies.utils.DataUtil
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    companion object {
        const val PREFS_NAME = "default_prefs"
        const val IS_FIRST_START = "is_first_start"
    }

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(mainModule(), viewModelsModel())
        }

        checkForFirstStart()
    }

    private fun checkForFirstStart() {
        val strategiesRepository: StrategiesRepository by inject()
        val sharedPrefs = getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

        val isFirstStart = sharedPrefs.getBoolean(IS_FIRST_START, true)

        if (isFirstStart) {
            GlobalScope.launch {
                strategiesRepository.insert(*DataUtil.getStrategiesData().toTypedArray())
            }
            with(sharedPrefs.edit()) {
                putBoolean(IS_FIRST_START, false)
                apply()
            }
        }
    }
}