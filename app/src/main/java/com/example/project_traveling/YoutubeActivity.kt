package com.example.project_traveling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeId = "35npVaFGHMY"
        val yoututubeWebView: WebView = findViewById(R.id.YtVideo)
        val webSettings: WebSettings = yoututubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        yoututubeWebView.loadUrl("https://www.youtube.com/watch?v=$youtubeId")
        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        button.setOnClickListener {
            Intent(this, VideoActivity::class.java).apply { startActivity(this) }
        }
    }
}