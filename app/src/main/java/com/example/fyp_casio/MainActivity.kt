package com.example.fyp_casio

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
        bind.clr.setOnClickListener {}
        bind.sqr.setOnClickListener {}
        bind.sqrt.setOnClickListener {}
        bind.by.setOnClickListener {}
        bind.logpwr.setOnClickListener {}
        bind.log.setOnClickListener {}
        bind.ln.setOnClickListener {}
        bind.neg.setOnClickListener {}
        bind.dms.setOnClickListener {}
        bind.hyp.setOnClickListener {}
        bind.sin.setOnClickListener {}
        bind.cos.setOnClickListener {}
        bind.tan.setOnClickListener {}
        bind.rcl.setOnClickListener {}
        bind.eng.setOnClickListener {}
        bind.open.setOnClickListener {}
        bind.close.setOnClickListener {}
        bind.M.setOnClickListener {}
        bind.seven.setOnClickListener {}
        bind.eight.setOnClickListener {}
        bind.nine.setOnClickListener {}
        bind.cut.setOnClickListener {}
        bind.four.setOnClickListener {}
        bind.five.setOnClickListener {}
        bind.six.setOnClickListener {}
        bind.mul.setOnClickListener {}
        bind.div.setOnClickListener {}
        bind.one.setOnClickListener {}
        bind.two.setOnClickListener {}
        bind.plus.setOnClickListener {}
        bind.minus.setOnClickListener {}
        bind.mul.setOnClickListener {}
        bind.zero.setOnClickListener {}
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