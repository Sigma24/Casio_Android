package com.example.fyp_casio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MenuAdapter(private val context: Context, private val menuItems: List<String>) : BaseAdapter() {
    override fun getCount(): Int = menuItems.size
    override fun getItem(position: Int): Any = menuItems[position]
    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false)
        val menuItemText = view.findViewById<TextView>(R.id.menuItemText)
        menuItemText.text = menuItems[position]
        return view
    }
}
