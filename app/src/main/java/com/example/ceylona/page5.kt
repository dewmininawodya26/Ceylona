package com.example.ceylona

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page5)

        val btnNavigate31: ImageView = findViewById(R.id.imageView14)
        btnNavigate31.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }

        val btnNavigate32: ImageView = findViewById(R.id.imageView16)
        btnNavigate32.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
        }

        val btnNavigate33: ImageView = findViewById(R.id.imageView18)
        btnNavigate33.setOnClickListener {
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