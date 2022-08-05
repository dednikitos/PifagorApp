package com.example.pifagorapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun findHypo(view : View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun findCath(view : View){
        val intent = Intent(this, TwoMainActivity::class.java)
        startActivity(intent)
    }
}