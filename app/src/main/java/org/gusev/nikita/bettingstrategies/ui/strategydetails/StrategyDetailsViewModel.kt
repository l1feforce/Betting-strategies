package org.gusev.nikita.bettingstrategies.ui.strategydetails

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.gusev.nikita.bettingstrategies.data.local.strategies.StrategiesRepository
import org.gusev.nikita.bettingstrategies.extensions.scaleAnimation
import org.gusev.nikita.bettingstrategies.model.Strategy

class StrategyDetailsViewModel(private val strategiesRepository: StrategiesRepository) :
    ViewModel() {
    val strategyDetails = MutableLiveData<Strategy>()

    fun onFavoriteChecked(isChecked: Boolean, view: View) {
        view.startAnimation(scaleAnimation())
        val strategyItem = strategyDetails.value ?: Strategy()
        viewModelScope.launch {
            if (isChecked) strategiesRepository.makeFavorite(strategyItem)
            else strategiesRepository.removeFavorite(strategyItem)
        }
        strategyDetails.value = strategyItem.copy(isFavorite = isChecked)
    }
}