package com.example.tictactoehomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.view.View

class PlayerSetup : AppCompatActivity() {
    private lateinit var submit : Button
    private lateinit var first_name : TextView
    private lateinit var second_name : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_setup)

        submit = findViewById(R.id.button3) as Button
        first_name = findViewById(R.id.editTextTextPersonName3)
        second_name = findViewById(R.id.editTextTextPersonName4)


        submit.setOnClickListener() {
            val intent = Intent(this, GameDisplay::class.java)
            if (first_name.text.isEmpty() || second_name.text.isEmpty())
            { Toast.makeText(this, "გთხოვთ შეიყვანოთ მოთამაშეების სახელები", Toast.LENGTH_SHORT).show() }
            else { startActivity(intent) }
        }
    }
}