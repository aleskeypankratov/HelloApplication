package com.example.helloapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelloActivity : AppCompatActivity() {

    private lateinit var textName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        textName = findViewById(R.id.textView)
        val text = intent.getStringExtra("name")
        textName.text = "Hello, $text"
    }
}