package com.nyx.multiplicationtable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val multipliers: List<Multiplier>,
    private val listener: OnMultiplierClickListener,
) : RecyclerView.Adapter<MultiplierViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MultiplierViewHolder {
        return MultiplierViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.multiplier_item,
                parent,
                false,
            ),
            listener
        )
    }

    override fun onBindViewHolder(holder: MultiplierViewHolder, position: Int) {
        val multiplier = multipliers[position]
        holder.setContent(multiplier)
    }

    override fun getItemCount(): Int {
        return multipliers.size
    }
}

class MultiplierViewHolder(
    itemView: View,
    private val listener: OnMultiplierClickListener,
) : RecyclerView.ViewHolder(itemView) {
    fun setContent(multiplier: Multiplier) {
        val titleView = itemView.findViewById<TextView>(R.id.title)
        val description = itemView.findViewById<TextView>(R.id.description)
        val button = itemView.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            listener.onMultiplierClick(multiplier.value)
        }

        val title = if (multiplier.value == 1) {
            "Умножение на один"
        } else if (multiplier.value == 2) {
            "Умножение на два"

        } else if (multiplier.value == 3) {
            "Умножение на три"

        } else if (multiplier.value == 4) {
            "Умножение на четыре"

        } else if (multiplier.value == 5) {
            "Умножение на пять"

        } else if (multiplier.value == 6) {
            "Умножение на шесть"

        } else if (multiplier.value == 7) {
            "Умножение на семь"

        } else if (multiplier.value == 8) {
            "Умножение на восемь"

        } else if (multiplier.value == 9) {
            "Умножение на девять"

        } else {
        }


        titleView.text = title.toString()
        description.text = multiplier.value.toString()
    }
}
