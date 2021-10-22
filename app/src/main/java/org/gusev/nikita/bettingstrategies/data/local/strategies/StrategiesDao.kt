package org.gusev.nikita.bettingstrategies.data.local.strategies

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import org.gusev.nikita.bettingstrategies.model.Strategy

@Dao
interface StrategiesDao {
    @Query("SELECT * FROM strategy")
    fun getAll(): Flow<List<Strategy>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg strategies: Strategy)

    @Update
    suspend fun update(strategy: Strategy)

    @Query("SELECT * FROM strategy WHERE isFavorite = 1")
    fun getAllFavorites(): Flow<List<Strategy>>
}