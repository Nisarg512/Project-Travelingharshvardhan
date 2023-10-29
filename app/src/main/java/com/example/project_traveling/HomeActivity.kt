package com.example.project_traveling

import android.app.Service
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myButton = findViewById<TextView>(R.id.textView4)
        myButton?.setOnClickListener {
            // Handle the click event here
            // You can perform actions like navigating to another page, displaying a dialog, etc.
            // For example:
            // val intent = Intent(this, AnotherActivity::class.java)
            val intent = Intent(this,MusicActivity::class.java )
            startActivity(intent)
        }
    }
}