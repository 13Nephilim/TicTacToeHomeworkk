package com.example.tictactoehomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.tictactoehomework.PlayerSetup
import com.example.tictactoehomework.R


class MainActivity : AppCompatActivity() {
    private lateinit var play_button : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play_button = findViewById(R.id.button)

        play_button.setOnClickListener {
            val intent = Intent(this, PlayerSetup::class.java)
            startActivity(intent)
        }



    }
}