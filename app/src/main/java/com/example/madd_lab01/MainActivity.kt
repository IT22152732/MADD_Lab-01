package com.example.madd_lab_01

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.madd_lab01.R

class MainActivity : AppCompatActivity() {

    fun whoAmI(param: Any): String {
        return param::class.simpleName ?: "Unknown"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val outputText = findViewById<TextView>(R.id.outputText)

        val result = buildString {
            appendLine("Result of whoAmI():")
            appendLine(whoAmI(10))
            appendLine(whoAmI("Hello"))
            appendLine(whoAmI(3.14))
            appendLine(whoAmI(true))
        }

        outputText.text = result
    }
}
