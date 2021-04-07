package com.example.justsaveit.ui.link

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.justsaveit.R
import com.example.justsaveit.databinding.ItemLinkBinding
import com.example.justsaveit.domain.model.Link

class LinkAdapter : RecyclerView.Adapter<LinkAdapter.LinkViewHolder> (){
    private var listData = ArrayList<Link>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinkAdapter.LinkViewHolder =
            LinkViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_link, parent, false))

    override fun onBindViewHolder(holder: LinkAdapter.LinkViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount() = listData.size

    inner class LinkViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val binding =ItemLinkBinding.bind(itemView)
        fun bind(data: Link){
            with(binding){

            }
        }
    }

}