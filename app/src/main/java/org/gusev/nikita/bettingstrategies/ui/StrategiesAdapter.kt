package org.gusev.nikita.bettingstrategies.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.gusev.nikita.bettingstrategies.databinding.ItemStrategyBinding
import org.gusev.nikita.bettingstrategies.model.Strategy

class StrategiesAdapter(
    private val onDetailsClick: (Strategy) -> Unit,
    private val onFavoriteChecked: (Strategy, Boolean, View) -> Unit
) : ListAdapter<Strategy, StrategiesAdapter.StrategyViewHolder>(Companion) {

    class StrategyViewHolder(val binding: ItemStrategyBinding) :
        RecyclerView.ViewHolder(binding.root)

    companion object : DiffUtil.ItemCallback<Strategy>() {
        override fun areItemsTheSame(oldItem: Strategy, newItem: Strategy): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Strategy, newItem: Strategy): Boolean =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StrategyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemStrategyBinding.inflate(layoutInflater, parent, false)

        return StrategyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: StrategyViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.binding.strategyItem = currentItem
        holder.binding.onDetailsClick = onDetailsClick
        holder.binding.onFavoriteChecked = onFavoriteChecked
        holder.binding.executePendingBindings()
    }
}