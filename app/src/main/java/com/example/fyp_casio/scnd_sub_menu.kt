package com.example.fyp_casio

import android.content.Context

class scnd_sub_menu {

    fun second_sub_menu_click(context: Context, selectedItem: String) {
        val itemName = selectedItem.substringAfter(": ").trim()

        when (itemName) {
            // Matrix Menu Items
            "MatA" -> {
                val matrixMenuItems = listOf("1:  1 x 1", "2:  1 x 2", "3:  1 x 3", "4:  2 x 1", "5:  2 x 2", "6:  2 x 3", "7:  3 x 1", "8:  3 x 2", "9:  3 x 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }
            "MatB" -> {
                val matrixMenuItems = listOf("1:  1 x 1", "2:  1 x 2", "3:  1 x 3", "4:  2 x 1", "5:  2 x 2", "6:  2 x 3", "7:  3 x 1", "8:  3 x 2", "9:  3 x 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }

            "MatC" -> {
                val matrixMenuItems = listOf("1:  1 x 1", "2:  1 x 2", "3:  1 x 3", "4:  2 x 1", "5:  2 x 2", "6:  2 x 3", "7:  3 x 1", "8:  3 x 2", "9:  3 x 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }

            //vector Menu Items
            "VectA" -> {
                val matrixMenuItems = listOf("1=>  1 : 2" ,"2=> 1 : 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }
            "VectB" -> {
                val matrixMenuItems = listOf("1=>  1 : 2" ,"2=> 1 : 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }
            "VectC" -> {
                val matrixMenuItems = listOf("1=>  1 : 2" ,"2=> 1 : 3")
                showMenuDialog(context,"Size", matrixMenuItems) { newSelectedItem ->
                }
            }


        }
    }
}