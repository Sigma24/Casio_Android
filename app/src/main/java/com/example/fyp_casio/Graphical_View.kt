package com.example.fyp_casio

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fyp_casio.databinding.ActivityGraphicalViewBinding
import com.example.fyp_casio.databinding.ActivityMainBinding
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class Graphical_View : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_graphical_view)

        val bind = ActivityGraphicalViewBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val showgraph = findViewById<LineChart>(R.id.graphView)
        val entries = ArrayList<Entry>()

        for (i in 0..100) {
            val x = i.toFloat()
            val y = Math.sin(x / 10.0).toFloat()
            entries.add(Entry(x, y))
        }


        val dataSet = LineDataSet(entries, "Sine Wave")
        dataSet.color = android.graphics.Color.BLUE
        dataSet.valueTextSize = 12f
        dataSet.setDrawCircles(false)


        val lineData = LineData(dataSet)
        showgraph.data = lineData


        showgraph.xAxis.position = XAxis.XAxisPosition.BOTTOM
        showgraph.axisRight.isEnabled = false
        showgraph.description.isEnabled = false
        showgraph.invalidate()


       bind.btnClose.setOnClickListener {
           intent = Intent(this, MainActivity::class.java)
               startActivity(intent)

       }



    }
}
