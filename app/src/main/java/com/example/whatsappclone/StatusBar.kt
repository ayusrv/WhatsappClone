package com.example.whatsappclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StatusBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status_bar)

        val ButtonChats=findViewById<TextView>(R.id.chats)
        ButtonChats.setOnClickListener {
            val intent= Intent(this@StatusBar,MainActivity::class.java)
            startActivity(intent)
        }

        val ButtonCalls=findViewById<TextView>(R.id.call)
        ButtonCalls.setOnClickListener {
            val intent= Intent(this@StatusBar,Calls::class.java)
            startActivity(intent)
        }
    }
}