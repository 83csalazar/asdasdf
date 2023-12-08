package com.example.testy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_option.view.*

class OptionAdapter(private val options: List<Option>) : RecyclerView.Adapter<OptionAdapter.OptionViewHolder>() {

    class OptionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(option: Option) {
            itemView.optionTitle.text = option.title
            itemView.optionImage.setImageResource(option.imageResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OptionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_option, parent, false)
        return OptionViewHolder(view)
    }

    override fun onBindViewHolder(holder: OptionViewHolder, position: Int) {
        holder.bind(options[position])
    }

    override fun getItemCount(): Int {
        return options.size
    }
}
