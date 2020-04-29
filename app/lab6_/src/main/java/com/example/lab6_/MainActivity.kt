package com.example.lab6_

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var Abra: Button? = null
    var Cadabra: Button? = null
    var outerText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Abra = findViewById<View>(R.id.abra) as Button
        Cadabra = findViewById<View>(R.id.cadabra) as Button
        outerText = findViewById<View>(R.id.OuterText) as TextView
        Abra!!.setOnClickListener(this)
        Cadabra!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.abra ->
                outerText!!.text = "Dh27678hbjk”"
            R.id.cadabra -> outerText!!.text = "Lifkj439udj"
        }
    }
}
