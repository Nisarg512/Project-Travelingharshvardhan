package com.example.project_traveling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.security.Provider.Service

class MusicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music)

        val myButton1 = findViewById<Button>(R.id.Button1)
        myButton1?.setOnClickListener {
            val intent = Intent(this, Music1::class.java)
            startActivity(intent)
        }
        val myButton2 = findViewById<Button>(R.id.Button2)
        myButton2?.setOnClickListener {
            val intent = Intent(this, Music2::class.java)
            startActivity(intent)
        }
        val myButton3 = findViewById<Button>(R.id.Button3)
        myButton3?.setOnClickListener {
            val intent = Intent(this, Music1::class.java)
            startActivity(intent)
        }

        val myButton4 = findViewById<Button>(R.id.Button4)
        myButton4?.setOnClickListener {
            val intent = Intent(this, Music1::class.java)
            startActivity(intent)
        }
        val myButton5 = findViewById<Button>(R.id.Button5)
        myButton5?.setOnClickListener {
            val intent = Intent(this, Music1::class.java)
            startActivity(intent)
        }
    }
}
