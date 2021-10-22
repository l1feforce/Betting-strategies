package org.gusev.nikita.bettingstrategies.data.local.strategies

import androidx.room.Database
import androidx.room.RoomDatabase
import org.gusev.nikita.bettingstrategies.model.Strategy

const val STRATEGIES_DATABASE_NAME = "strategies_db"

@Database(
    entities = [Strategy::class], version = 1
)
abstract class StrategiesDatabase : RoomDatabase() {
    abstract fun strategiesDao(): StrategiesDao
}