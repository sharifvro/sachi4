package com.example.sachi4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


        val news: Button = findViewById(R.id.btnnews)
        news.setOnClickListener() {
            val intent = Intent(this,News::class.java)
            startActivity(intent)
        }

        val status: Button = findViewById(R.id.btn_status)
        status.setOnClickListener() {
            val intent = Intent(this, Status::class.java)
            startActivity(intent)
        }

        val openinbrowser: Button = findViewById(R.id.btnoib)
        btnoib.setOnClickListener() {
            val intent = Intent(this, OpenInBrowser::class.java)
            startActivity(intent)
        }

        val btnblog: Button = findViewById(R.id.btnblog)
        btnblog.setOnClickListener() {
            val intent = Intent(this, SchemeDetails::class.java)
            startActivity(intent)
        }

    }
}