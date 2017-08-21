package com.iceapinan.funfacts

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import java.util.*

class FunFactsActivity : AppCompatActivity() {
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()
    private lateinit var factTextView: TextView
    private lateinit var showFactButton: Button
    private lateinit var relativeLayout : RelativeLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        // Assign the Views from the layout files to corresponding files
        factTextView = findViewById(R.id.factTextView) as TextView
        showFactButton = findViewById(R.id.showFactButton) as Button
        relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout
        val listener = View.OnClickListener({
            val fact = factBook.getFact()
            val color = colorWheel.getColor()
            factTextView.text = fact
            relativeLayout.setBackgroundColor(color)
            showFactButton.setTextColor(color)
        })
        showFactButton.setOnClickListener(listener)
        Toast.makeText(this,"Hello, My name is Apinan",Toast.LENGTH_SHORT).show()

    }
}
