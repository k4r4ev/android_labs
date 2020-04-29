package com.example.lab7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var intent = getIntent()
        var message : String = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        //var textView1 : TextView = findViewById(R.id.textView1)
        //textView1.setText = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView = TextView(this)
        textView.setText(intent.getStringExtra(MainActivity().EXTRA_MESSAGE))
        //setContentView(R.layout.activity_display_message)
        setContentView(textView)
    }
}
