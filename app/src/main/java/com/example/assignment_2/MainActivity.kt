package com.example.assignment_2

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)

        // Button 1: Change the text of TextView
        button1.setOnClickListener {
            textView.text = "Button 1 Clicked!"
        }

        // Button 2: Change the height of TextView
        button2.setOnClickListener {
            textView.layoutParams.height = 200
            textView.requestLayout()
        }

        // Button 3: Bring the text to the center of the screen
        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as RelativeLayout.LayoutParams
            layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT, RelativeLayout.TRUE)
            textView.layoutParams = layoutParams
        }

        // Button 4: Change the background color of TextView
        button4.setOnClickListener {
            textView.setBackgroundColor(resources.getColor(R.color.purple_200))
        }

        // Button 5: Reset the TextView to its original state
        button5.setOnClickListener {
            textView.text = "Assignment 2"
            textView.layoutParams.height = RelativeLayout.LayoutParams.WRAP_CONTENT
            textView.setBackgroundColor(resources.getColor(R.color.teal_200))
            val layoutParams = textView.layoutParams as RelativeLayout.LayoutParams
            layoutParams.removeRule(RelativeLayout.CENTER_IN_PARENT)
            textView.layoutParams = layoutParams
        }
    }
}
