package dev.sanjaygangwar.tempproject.ui.fragment.home.adapter

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import dev.sanjaygangwar.tempproject.databinding.CharacterItemBinding
import dev.sanjaygangwar.tempproject.models.data.EmployeeData
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.hide
import dev.sanjaygangwar.tempproject.utils.extenstionfuntions.ImageExtensions.loadImageFromUrl


class HomeRecyclerViewHolder(
    private val context: Context,
    private val bind: CharacterItemBinding,
    private val listener: HomeRecyclerAdapter.onClickListner,
    private val flag: Boolean
) : RecyclerView.ViewHolder(bind.root), View.OnClickListener {

    private lateinit var items: EmployeeData

    init {
        bind.card.setOnClickListener(this)
    }

    fun bind(data: EmployeeData) {
        this.items = data
        //bind data with ui

        items.employee_name.let {
            bind.name.text = it
        }
        if (items.profile_image.isNotEmpty()) {
            bind.profileImage.loadImageFromUrl(items.profile_image)
        } else {
            bind.profileImage.hide()
        }


    }

    override fun onClick(p0: View) {
        when (p0) {
            bind.card -> {
//                if (true) {
//                    listener.onItemCLicked(items)
//                }
            }
        }
    }
}