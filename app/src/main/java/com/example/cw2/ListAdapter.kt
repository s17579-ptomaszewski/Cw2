package com.example.cw2

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.cw2.databinding.ActivityDrugieBinding
import com.example.cw2.databinding.ElementBinding

class ListAdapter(val dane: ArrayList<String>): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(binding: ElementBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListAdapter.ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ElementBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        if(holder.itemView is TextView){
            holder.itemView.text = dane[position]
            holder.itemView.setOnClickListener{
                Toast.makeText(holder.itemView.context, dane[position], Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int = dane.size
}