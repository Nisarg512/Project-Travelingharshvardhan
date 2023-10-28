package com.example.project_traveling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_login)

        val signup: Button = findViewById(R.id.signup)
        signup.setOnClickListener {
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }
        val login: Button = findViewById(R.id.login1)
        login.setOnClickListener{
            Intent(this,HomeActivity::class.java).also { startActivity(it) }

        }
    }

}