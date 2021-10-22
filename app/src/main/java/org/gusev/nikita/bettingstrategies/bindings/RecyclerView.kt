package org.gusev.nikita.bettingstrategies.bindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter(value = ["adapter"])
fun RecyclerView.adapter(
    adapter: RecyclerView.Adapter<*>) {
    this.adapter = adapter
}