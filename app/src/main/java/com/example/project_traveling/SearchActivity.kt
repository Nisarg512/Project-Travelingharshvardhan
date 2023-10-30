package com.example.project_traveling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.Button
import android.widget.EditText

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imageView: ImageView = findViewById(R.id.imageView3)
        val urlEditText: EditText = findViewById(R.id.url)

        imageView.setOnClickListener {
            val url = urlEditText.text.toString()
            openUrlInBrowser(url)
        }
    }

    private fun openUrlInBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}






