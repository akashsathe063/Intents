package com.udemy.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity2 : AppCompatActivity() {
    lateinit var result : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        result = findViewById(R.id.textView)

      var userName =  intent.getStringExtra("user_name").toString()
        var userAge = intent.getIntExtra("user_age",0)

        result.text = "Your name is $userName and your age is $userAge"
    }
}