package com.example.latihanviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Tteokbokki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tteokbokki)
        supportActionBar?.title = "Tteokbokki"
    }
}