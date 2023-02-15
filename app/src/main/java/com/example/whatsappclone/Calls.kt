package com.example.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calls : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calls)

        val ButtonStatus=findViewById<TextView>(R.id.status)
        ButtonStatus.setOnClickListener {
            val intent= Intent(this@Calls,StatusBar::class.java)
            startActivity(intent)
        }

        val ButtonChats=findViewById<TextView>(R.id.chats)
        ButtonChats.setOnClickListener {
            val intent= Intent(this@Calls,MainActivity::class.java)
            startActivity(intent)
        }
    }
}