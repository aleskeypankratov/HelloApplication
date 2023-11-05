package com.example.helloapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var randomNumberButton: Button
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNumberButton = findViewById(R.id.button)
        editText = findViewById(R.id.editText)
    }

    fun onClickHello(view: View) {

        val readText: String = editText.text.toString()
        if (readText.isNotEmpty()) {
            startActivity(Intent(this, HelloActivity::class.java).putExtra("name", readText))
        }
    }
}