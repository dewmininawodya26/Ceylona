package com.example.ceylona

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page7)

        val btnNavigate71: TextView = findViewById(R.id.textView11)
        btnNavigate71.setOnClickListener {
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
        }

        val btnNavigate72: ImageView = findViewById(R.id.imageView14)
        btnNavigate72.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }

        val btnNavigate73: ImageView = findViewById(R.id.imageView16)
        btnNavigate73.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
        }

        val btnNavigate74: ImageView = findViewById(R.id.imageView17)
        btnNavigate74.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }

        val btnNavigate75: ImageView = findViewById(R.id.imageView18)
        btnNavigate75.setOnClickListener {
            val intent = Intent(this, page6::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}