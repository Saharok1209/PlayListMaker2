package com.example.playlistmaker2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class SettingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        val arrowBackId = findViewById<ImageView>(R.id.arrow_back)
        arrowBackId.setOnClickListener{
            finish()
        }
        val shared = findViewById<TextView>(R.id.shareAction)
        shared.setOnClickListener{
            Toast.makeText(this, "Решили поделиться!", Toast.LENGTH_SHORT).show()
        }
        val writeSupport = findViewById<TextView>(R.id.supportWrite)
        writeSupport.setOnClickListener{
            Toast.makeText(this, "Написать в поддержку", Toast.LENGTH_SHORT).show()
        }
    }
}