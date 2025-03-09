package com.example.fyp_casio

import android.content.Context

class sub_menu_items {
    fun modeClick(context: Context, selectedItem: String) {
        val itemName = selectedItem.substringAfter(": ").trim()

        when (itemName) {
            // mode
            "MATRIX" -> {
                val matrixMenuItems = listOf("1: MatA", "2: MatB", "3: MatC")


                showMenuDialog(context,"MATRIX", matrixMenuItems) { newSelectedItem ->
                    val scnd = scnd_sub_menu()
                    scnd.second_sub_menu_click(context, newSelectedItem)

                }

            }
            "VECTOR" -> {
                val VectorMenuItems = listOf("1: VectA", "2: VectB", "3: VectC")


                showMenuDialog(context,"VECTOR", VectorMenuItems) { newSelectedItem ->
                    val scnd = scnd_sub_menu()
                    scnd.second_sub_menu_click(context, newSelectedItem)

                }
            }
            "BASE_N" -> {
                val baseMenuItems = listOf("1: Decimal", "2: Binary", "3: Hexadecimal" , "4: Octal")
                showMenuDialog(context,"BASE_N", baseMenuItems) { newSelectedItem ->


                }
            }
            "TABLE" -> {

            }
            "STAT" -> {
                val statsMenuItems = listOf(
                    "1: 1-VAR",
                    "2: A+BX",
                    "3: --+CX²",
                    "4: LN X",
                    "5: eˣ",
                    "6: A·Bˣ",
                    "7: A·Xˣ",
                    "8: 1/X"
                )


                showMenuDialog(context,"STATISTICS", statsMenuItems) { newSelectedItem ->
                    val scnd = scnd_sub_menu()
                    scnd.second_sub_menu_click(context, newSelectedItem)

                }
            }
            "EQN" -> {
                val matrixMenuItems = listOf(
                    "1: anX + bnY = cn",
                    "2: aXn + bnY + cnZ = dn",
                    "3: aX² + bX + c = 0",
                    "4: aX³ + bX² + cX + d = 0"
                )


                showMenuDialog(context,"EQUATIONS", matrixMenuItems) { newSelectedItem ->
                    val scnd = scnd_sub_menu()
                    scnd.second_sub_menu_click(context, newSelectedItem)

                }
            }
            "CMPLX" -> {

            }

            //Shift mode



            // Matrix mode







        }
    }
}
