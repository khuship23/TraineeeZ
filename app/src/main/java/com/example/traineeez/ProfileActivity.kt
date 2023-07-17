package com.example.traineeez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra(SignIN.KEY2)
        val mail = intent.getStringExtra(SignIN.KEY1)
        val userid = intent.getStringExtra(SignIN.KEY3)

        val hellotext = findViewById<TextView>(R.id.tvHello)
        val mailtext = findViewById<TextView>(R.id.tvMail)
        val idtext = findViewById<TextView>(R.id.tvUniqueId)

        hellotext.text = "Hello $name"
        idtext.text = "UniqueId : $userid"
        mailtext.text = "Mail : $mail"



    }
}