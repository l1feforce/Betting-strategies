package org.gusev.nikita.bettingstrategies.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.gusev.nikita.bettingstrategies.R
import org.gusev.nikita.bettingstrategies.databinding.FragmentFavoriteBinding
import org.gusev.nikita.bettingstrategies.extensions.scaleAnimation
import org.gusev.nikita.bettingstrategies.model.Strategy
import org.gusev.nikita.bettingstrategies.ui.StrategiesAdapter
import org.gusev.nikita.bettingstrategies.ui.strategydetails.StrategyDetailsFragment
import org.koin.androidx.viewmodel.ext.android.viewModel

class FavoriteFragment : Fragment() {

    private val viewModel: FavoriteViewModel by viewModel()
    private var _binding: FragmentFavoriteBinding? = null
    private lateinit var favoriteStrategiesAdapter: StrategiesAdapter

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_favorite, container, false)
        val root: View = binding.root
        binding.lifecycleOwner = this.viewLifecycleOwner
        favoriteStrategiesAdapter = StrategiesAdapter(::onDetailsClick, ::onFavoriteChecked)

        binding.favoriteStrategiesAdapter = favoriteStrategiesAdapter
        binding.viewModel = viewModel
        //bind views
        viewModel.favoriteStrategiesList.observe(viewLifecycleOwner, {
            favoriteStrategiesAdapter.submitList(it)
        })

        return root
    }

    private fun onDetailsClick(strategyItem: Strategy) {
        val bundle = bundleOf(StrategyDetailsFragment.STRATEGY_DETAILS_KEY to strategyItem)
        findNavController().navigate(R.id.navigation_strategy_details, bundle)
    }

    private fun onFavoriteChecked(strategyItem: Strategy, isChecked: Boolean, view: View) {
        view.startAnimation(scaleAnimation())
        viewModel.onFavoriteChecked(strategyItem, isChecked)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}