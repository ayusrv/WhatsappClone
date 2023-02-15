package com.example.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.activity_main)

        val ButtonStatus=findViewById<TextView>(R.id.status)
        ButtonStatus.setOnClickListener {
            val intent= Intent(this@MainActivity,StatusBar::class.java)
            startActivity(intent)
        }

        val ButtonCalls=findViewById<TextView>(R.id.call)
        ButtonCalls.setOnClickListener {
            val intent= Intent(this@MainActivity,StatusBar::class.java)
            startActivity(intent)
        }
    }
}