package org.gusev.nikita.bettingstrategies.ui.strategydetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import org.gusev.nikita.bettingstrategies.R
import org.gusev.nikita.bettingstrategies.databinding.FragmentStrategyDetailsBinding
import org.gusev.nikita.bettingstrategies.model.Strategy
import org.koin.androidx.viewmodel.ext.android.viewModel

class StrategyDetailsFragment : Fragment() {

    companion object {
        const val STRATEGY_DETAILS_KEY = "strategy_details_key"
    }

    private val viewModel: StrategyDetailsViewModel by viewModel()
    private var _binding: FragmentStrategyDetailsBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_strategy_details, container, false)
        val root: View = binding.root

        binding.lifecycleOwner = this.viewLifecycleOwner
        binding.viewModel = viewModel

        val strategyDetails = arguments?.getParcelable(STRATEGY_DETAILS_KEY) as Strategy?
        strategyDetails?.let { viewModel.strategyDetails.value = it }
        arguments?.putParcelable(STRATEGY_DETAILS_KEY, null)

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}