package com.example.project_traveling

import android.app.Service
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val myButton = findViewById<TextView>(R.id.textView4)
        myButton?.setOnClickListener {
            val intent = Intent(this, MusicActivity::class.java)
            startActivity(intent)
        }
        val videobutton = findViewById<TextView>(R.id.textView411)
        videobutton?.setOnClickListener {
            val intent = Intent(this, VideoActivity::class.java)
            startActivity(intent)


        }
        val searchbutton = findViewById<ImageView>(R.id.imageView3)
        searchbutton?.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}