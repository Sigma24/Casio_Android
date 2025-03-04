package com.example.fyp_casio

import android.app.Dialog
import android.content.Context
import android.view.Window
import android.widget.ListView
import android.widget.TextView

fun showMenuDialog(context: Context, menuTitle: String, menuItems: List<String>, onItemSelected: (String) -> Unit) {
    val dialog = Dialog(context, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
    dialog.setContentView(R.layout.menu_dialogue)

    val menuTitleText = dialog.findViewById<TextView>(R.id.menuTitle)
    val menuListView = dialog.findViewById<ListView>(R.id.menuListView)
    val cancelText = dialog.findViewById<TextView>(R.id.cancelText)


    menuTitleText.text = menuTitle

    menuListView.adapter = MenuAdapter(context, menuItems)

    menuListView.setOnItemClickListener { _, _, position, _ ->
        onItemSelected(menuItems[position])
        dialog.dismiss()
    }

    cancelText.setOnClickListener { dialog.dismiss() }

    dialog.show()
}
