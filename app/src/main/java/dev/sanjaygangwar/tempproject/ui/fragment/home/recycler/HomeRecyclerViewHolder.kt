package dev.sanjaygangwar.tempproject.ui.fragment.home.recycler

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.sanjaygangwar.tempproject.databinding.CharacterItemBinding
import dev.sanjaygangwar.tempproject.models.dataclass.Characters


class HomeRecyclerViewHolder(
    private val context: Context,
    private val bind: CharacterItemBinding,
    private val listener: HomeRecyclerAdapter.onClickListner,
    private val flag: Boolean
) : RecyclerView.ViewHolder(bind.root), View.OnClickListener {

    private lateinit var items: Characters

    init {
        bind.card.setOnClickListener(this)
    }

    fun bind(data: Characters) {
        this.items = data
        //bind data with ui
        bind.name.text = items.name
    }

    override fun onClick(p0: View) {
        when (p0) {
            bind.card -> {
                if (true) {
                    listener.onItemCLicked(items)
                }
            }
        }
    }
}