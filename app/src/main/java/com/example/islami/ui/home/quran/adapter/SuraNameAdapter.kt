package com.example.islami.ui.home.quran.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class SuraNameAdapter(val items: List<String>) :
    RecyclerView.Adapter<SuraNameAdapter.Viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_sura_name, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        val suraname = items.get(position)
        holder.name.setText(suraname)
        /*onItemClickListener?.let { clickListener->holder.itemView.setOnClickListener {
            clickListener.onItemClick(position,suraname)
        } }*/
        if (onItemClickListener != null) {
            holder.itemView.setOnClickListener {
                onItemClickListener?.onItemClick(position, suraname)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size

    }

    var onItemClickListener: OnItemClicklistener? = null

    interface OnItemClicklistener {
        fun onItemClick(position: Int, name: String)
    }


    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.item_sura_name)
    }


}