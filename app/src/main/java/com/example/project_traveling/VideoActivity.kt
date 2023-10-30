package com.example.project_traveling

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val myVideoview : VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.videorain)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()
        val button = findViewById<FloatingActionButton>(R.id.floatingActionButton1)
        button.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
        }
    }
}