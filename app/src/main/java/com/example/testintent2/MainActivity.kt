package com.example.testintent2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            val data: Uri = Uri.parse("http://www.google.com/")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(data)
            startActivity(intent)
        }
    }
}