package com.androidtutorials.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnScreen2 = findViewById<Button>(R.id.btnScreen2)
        btnScreen2.setOnClickListener {
            intent = Intent(applicationContext, CardsActivity::class.java)
            startActivity(intent)
        }
    }
}