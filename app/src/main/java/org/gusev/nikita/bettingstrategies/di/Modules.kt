package org.gusev.nikita.bettingstrategies.di

import androidx.room.Room
import org.gusev.nikita.bettingstrategies.data.local.strategies.STRATEGIES_DATABASE_NAME
import org.gusev.nikita.bettingstrategies.data.local.strategies.StrategiesDatabase
import org.gusev.nikita.bettingstrategies.data.local.strategies.StrategiesRepository
import org.gusev.nikita.bettingstrategies.ui.favorite.FavoriteViewModel
import org.gusev.nikita.bettingstrategies.ui.strategies.StrategiesViewModel
import org.gusev.nikita.bettingstrategies.ui.strategydetails.StrategyDetailsViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun mainModule() = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            StrategiesDatabase::class.java,
            STRATEGIES_DATABASE_NAME
        ).build()
    }
    single { StrategiesRepository(get()) }
}

fun viewModelsModel() = module {
    viewModel { StrategiesViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { StrategyDetailsViewModel(get()) }
}
