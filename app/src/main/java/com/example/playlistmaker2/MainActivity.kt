package com.example.playlistmaker2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonSearchId = findViewById<Button>(R.id.searchId)
        val buttonLibraryId = findViewById<Button>(R.id.libraryId)
        val buttonSettingId = findViewById<Button>(R.id.settingId)

                buttonSearchId.setOnClickListener{
                        val intent = Intent(this@MainActivity, SearchActivity::class.java)
                        startActivity(intent)
                    }
                    buttonLibraryId.setOnClickListener {
                        val intent = Intent(this@MainActivity, LibraryActivity::class.java)
                        startActivity(intent)
                    }
                    buttonSettingId.setOnClickListener {
                        val intent = Intent(this@MainActivity, SettingActivity::class.java)
                        startActivity(intent)
                    }
                }
            }


