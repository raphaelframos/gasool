package com.powellapps.gasool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : AppCompatButton = findViewById(R.id.button_calculate)
        val textViewResult : AppCompatTextView = findViewById(R.id.text_view_result)

        button.setOnClickListener {
            Toast.makeText(this, "Colé parceiro", Toast.LENGTH_LONG).show()
            textViewResult.text = "Tamo ai ${Date().time}"
        }

    }
}