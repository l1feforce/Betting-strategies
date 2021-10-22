package org.gusev.nikita.bettingstrategies.ui.favorite

import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.gusev.nikita.bettingstrategies.data.local.strategies.StrategiesRepository
import org.gusev.nikita.bettingstrategies.model.Strategy

class FavoriteViewModel(private val strategiesRepository: StrategiesRepository) : ViewModel() {
    val favoriteStrategiesList = strategiesRepository.getAllFavorites().asLiveData()
    val isFavoriteStrategiesListEmpty = Transformations.map(favoriteStrategiesList) { it.isEmpty() }

    fun onFavoriteChecked(strategyItem: Strategy, isChecked: Boolean) {
        viewModelScope.launch {
            if (isChecked) strategiesRepository.makeFavorite(strategyItem)
            else strategiesRepository.removeFavorite(strategyItem)
        }
    }
}