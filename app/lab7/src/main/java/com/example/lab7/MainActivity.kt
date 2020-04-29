package com.example.lab7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    public var EXTRA_MESSAGE : String = "com.example.lab7.MESSAGE"

    fun sendMessage(view: View) {
        var intent = Intent (this@MainActivity, DisplayMessageActivity::class.java)
        var editText :EditText = findViewById(R.id.editMessage)
        var message : String = editText.getText().toString()

        var editText2 :EditText = findViewById(R.id.editMessage2)
        var message2 : String = editText2.getText().toString()

        intent.putExtra(EXTRA_MESSAGE, message + message2)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
