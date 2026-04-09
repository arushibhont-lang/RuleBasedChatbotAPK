package com.example.chatbot

import android.os.Bundle
import android.x.appcompat.app.AppCompatActivity
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL

        val input = EditText(this)
        val btn = Button(this)
        btn.text = "Send"
        val output = TextView(this)

        btn.setOnClickListener {
            val text = input.text.toString()
            output.text = when {
                text.contains("hello", true) -> "Hi!"
                text.contains("name", true) -> "I'm a Chatbot"
                else -> "I don't understand"
            }
        }

        layout.addView(input)
        layout.addView(btn)
        layout.addView(output)

        setContentView(layout)
    }
}