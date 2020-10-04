package com.example.recyclerview_sample

import com.example.recyclerview_sample.databinding.ItemListBinding
import com.xwray.groupie.databinding.BindableItem

class ListItem(private val string: String) : BindableItem<ItemListBinding>() {

    override fun getLayout(): Int = R.layout.item_list

    override fun bind(viewHolder: ItemListBinding, position: Int) {
        viewHolder.textView.text = string
    }
}