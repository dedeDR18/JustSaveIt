package com.example.justsaveit.ui.note

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.justsaveit.R
import com.example.justsaveit.databinding.ItemNoteBinding
import com.example.justsaveit.domain.model.Note

class NoteAdapter : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    private var listData = ArrayList<Note>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAdapter.NoteViewHolder =
            NoteViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_note, parent, false))

    override fun onBindViewHolder(holder: NoteAdapter.NoteViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount() = listData.size

    inner class NoteViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        private val binding = ItemNoteBinding.bind(itemView)
        fun bind(data: Note){
            with(binding){

            }
        }
    }

}