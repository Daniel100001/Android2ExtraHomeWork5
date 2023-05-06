package com.example.android2homework2.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2homework2.databinding.ItemNoteBinding
import com.example.android2homework2.models.NoteModel
import kotlin.collections.ArrayList

class NoteAppAdapter : RecyclerView.Adapter<NoteAppAdapter.NoteAppViewHolder>() {

    private var list: List<NoteModel> = ArrayList()

    fun setList(list: List<NoteModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    class NoteAppViewHolder(private val binding: ItemNoteBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(noteModel: NoteModel) {
            binding.descriptionItem.text = noteModel.description
            binding.titleItem.text = noteModel.title
            binding.time.text = noteModel.time
            binding.data.text = noteModel.data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteAppViewHolder {
        return NoteAppViewHolder(
            ItemNoteBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: NoteAppViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}
