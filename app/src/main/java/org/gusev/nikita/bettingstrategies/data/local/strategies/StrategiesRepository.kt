package org.gusev.nikita.bettingstrategies.data.local.strategies

import kotlinx.coroutines.flow.Flow
import org.gusev.nikita.bettingstrategies.model.Strategy

class StrategiesRepository(
    strategiesDatabase: StrategiesDatabase
) {
    private val strategiesDao = strategiesDatabase.strategiesDao()

    fun getAllStrategies(): Flow<List<Strategy>> = strategiesDao.getAll()

    suspend fun insert(vararg strategies: Strategy) {
        strategiesDao.insert(*strategies)
    }

    suspend fun makeFavorite(strategy: Strategy) {
        strategiesDao.update(strategy.copy(isFavorite = true))
    }

    suspend fun removeFavorite(strategy: Strategy) {
        strategiesDao.update(strategy.copy(isFavorite = false))
    }

    fun getAllFavorites(): Flow<List<Strategy>> =
        strategiesDao.getAllFavorites()

}