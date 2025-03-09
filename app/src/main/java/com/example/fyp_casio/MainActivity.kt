package com.example.fyp_casio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fyp_casio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        var  modetype="degree";
        var shiftkey=0
        var alpha=0






        bind.btnGraph.setOnClickListener {
            val intent = Intent(this, Graphical_View::class.java)
            startActivity(intent)
        }




        bind.btnDeg.setOnClickListener {
            when(modetype){
                "degree"->{
                    modetype="radian"
                    bind.btnDeg.text="RAD"
                }
                "radian"->{
                    modetype="gradian"
                    bind.btnDeg.text="GRAD"
                }
                "gradian"->{
                    modetype="degree"
                    bind.btnDeg.text="DEG"
                }
            }

        }





        bind.btnGrad.setOnClickListener {}
        bind.btnRad.setOnClickListener {}



        bind.shift.setOnClickListener {
            if (shiftkey == 1) {
                shiftkey = 0
                bind.btnRad.text = "-"
            } else {
                shiftkey = 1
                alpha = 0
                bind.btnRad.text = "S"
            }
            Toast.makeText(this, "Shift Key State: $shiftkey", Toast.LENGTH_SHORT).show()
        }


        bind.alpha.setOnClickListener {
            if (alpha == 1) {
                alpha = 0
                bind.btnRad.text = "-"
            } else {
                alpha = 1
                shiftkey = 0
                bind.btnRad.text = "A"
            }
            Toast.makeText(this, "Alpha Key State: $alpha", Toast.LENGTH_SHORT).show()
        }
        bind.left.setOnClickListener {}
        bind.right.setOnClickListener {}
        bind.down.setOnClickListener {}
        bind.up.setOnClickListener {}
        bind.SandD.setOnClickListener{}
        bind.cal.setOnClickListener {}
        bind.ans.setOnClickListener {}
        bind.clr.setOnClickListener {
            bind.display.text = ""
        }
        bind.pwr.setOnClickListener {
        }
        bind.sqr.setOnClickListener {

            bind.display.text = bind.display.text.toString() + "²"
        }
        bind.sqrt.setOnClickListener {

            bind.display.text = bind.display.text.toString() + "√"


        }
        bind.by.setOnClickListener {}
        bind.logpwr.setOnClickListener {

            bind.display.text = bind.display.text.toString() + "log ²"

        }
        bind.log.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "log"


        }
        bind.ln.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "ln"


        }
        bind.neg.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "-"


        }
        bind.dms.setOnClickListener {

            bind.display.text = bind.display.text.toString() + "°"

        }
        bind.hyp.setOnClickListener {}
        bind.sin.setOnClickListener {}
        bind.cos.setOnClickListener {}
        bind.tan.setOnClickListener {}
        bind.rcl.setOnClickListener {}
        bind.eng.setOnClickListener {}
        bind.open.setOnClickListener {

            bind.display.text = bind.display.text.toString() + "("


        }
        bind.close.setOnClickListener {
            bind.display.text = bind.display.text.toString() + ")"


        }
        bind.M.setOnClickListener {}
        bind.three.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "3"

        }

        bind.seven.setOnClickListener {
            val Const = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Constants",Const) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "7"


            }
        }
        bind.eight.setOnClickListener {
            val Conv = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Conversion",Conv) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "8"


            }

        }
        bind.nine.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "9"

        }
        bind.cut.setOnClickListener {
            val text = bind.display.text.toString()
            if (text.isNotEmpty()) {
                bind.display.text = text.substring(0, text.length - 1)
            }

        }
        bind.four.setOnClickListener {
            val Matrix = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Matrix",Matrix) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "4"

            }
        }
        bind.five.setOnClickListener {
            val Vectors = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Vector",Vectors) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "5"


            }
        }
        bind.six.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "6"

        }
        bind.mul.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "x"


        }
        bind.div.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "÷"
        }
        bind.one.setOnClickListener {
            val Stats = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Statistics",Stats) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "1"

            }
        }
        bind.two.setOnClickListener {
            val Cmplx = listOf("1: Dim", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
            if (shiftkey == 1) {

                showMenuDialog(this, "Complex",Cmplx) { selectedItem ->
                    shiftkey = 0
                    bind.btnRad.text = "-"
                    Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                    val menu = sub_menu_items()
                    menu.modeClick(this, selectedItem)
                }

            }
            else{
                bind.display.text = bind.display.text.toString() + "2"

            }
        }
        bind.plus.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "+"

        }
        bind.minus.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "-"


        }

        bind.zero.setOnClickListener {
            bind.display.text = bind.display.text.toString() + "0"


        }
        bind.dot.setOnClickListener {}
        bind.exp.setOnClickListener {}
        bind.ans.setOnClickListener {}
        bind.equal.setOnClickListener {}
        bind.inverse.setOnClickListener {}
        bind.integ.setOnClickListener {}
        bind.mode.setOnClickListener {
         val modeshiftMenuItems = listOf("1: MTHIO", "2: LINEIO", "3: DEG", "4: RAD", "5: GRAD", "6: FIX", "7: SCI", "8: NORM")
         val modeitems = listOf("1: CMPLX", "2: STAT", "3: BASE_N", "4: TABLE", "5: MATRIX", "6: EQN", "7: VECTOR")
            val items = if (shiftkey == 1) modeshiftMenuItems else modeitems
            showMenuDialog(this, "MODE",items) { selectedItem ->
          shiftkey = 0
          Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
             val menu = sub_menu_items()
          menu.modeClick(this, selectedItem)
         }
        }
    }
}