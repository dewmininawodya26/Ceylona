package com.example.ceylona

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page6)

        val btnNavigate40: ImageView = findViewById(R.id.imageView14)
        btnNavigate40.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            startActivity(intent)
        }

        val btnNavigate41: ImageView = findViewById(R.id.imageView16)
        btnNavigate41.setOnClickListener {
            val intent = Intent(this, page4::class.java)
            startActivity(intent)
        }

        val btnNavigate42: ImageView = findViewById(R.id.imageView17)
        btnNavigate42.setOnClickListener {
            val intent = Intent(this, page5::class.java)
            startActivity(intent)
        }

        val btnNavigate43: TextView = findViewById(R.id.accountname)
        btnNavigate43.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
        }

        val btnNavigate44: ImageView = findViewById(R.id.next1)
        btnNavigate43.setOnClickListener {
            val intent = Intent(this, page7::class.java)
            startActivity(intent)
        }

        val btnNavigate45: TextView = findViewById(R.id.textView10)
        btnNavigate45.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }

        val btnNavigate46: ImageView = findViewById(R.id.next6)
        btnNavigate46.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}