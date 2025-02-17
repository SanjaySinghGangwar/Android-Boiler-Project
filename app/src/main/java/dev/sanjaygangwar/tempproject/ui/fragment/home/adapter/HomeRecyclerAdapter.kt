package dev.sanjaygangwar.tempproject.ui.fragment.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.sanjaygangwar.tempproject.databinding.CharacterItemBinding
import dev.sanjaygangwar.tempproject.models.entity.Characters

class HomeRecyclerAdapter(
    private val context: Context, private val listener: onClickListner, private val flag: Boolean
) : RecyclerView.Adapter<HomeRecyclerViewHolder>() {

    interface onClickListner {
        fun onItemCLicked(id: Characters)
    }

    private val items = ArrayList<Characters>()

    fun setItems(items: ArrayList<Characters>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): HomeRecyclerViewHolder {
        val binding: CharacterItemBinding = CharacterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return HomeRecyclerViewHolder(context, binding, listener, flag)
    }

    override fun onBindViewHolder(holder: HomeRecyclerViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}
