package com.udemy.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var name :EditText
    lateinit var age : EditText
    lateinit var send : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.editTextTextPersonName)
        age = findViewById(R.id.editTextNumber)
        send = findViewById(R.id.button)

        send.setOnClickListener{
            var userName : String = name.text.toString()
            var userAge : Int =  age.text.toString().toInt()
           var intent = Intent(this@MainActivity,SecondActivity2::class.java)
            intent.putExtra("user_name",userName)
            intent.putExtra("user_age",userAge)
            startActivity(intent)
        }
    }
}