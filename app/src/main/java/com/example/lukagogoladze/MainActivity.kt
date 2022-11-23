package com.example.lukagogoladze

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    lateinit var fblogo: ImageView

    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.username1)
        val password = findViewById<EditText>(R.id.username)
        val login = findViewById<com.google.android.material.button.MaterialButton>(R.id.loginbtn)
        val textlogin = findViewById<TextView>(R.id.signin)
        val fblogo = findViewById<ImageView>(R.id.fblogo)
        val twitterlogo = findViewById<ImageView>(R.id.twitterlogo)
        val googlelogo = findViewById<ImageView>(R.id.googlelogo)
        val otherstoregister = findViewById<TextView>(R.id.otherstoregister)

        findViewById<TextView>(R.id.otherstoregister).setOnClickListener {
            startActivity(Intent( this,MainActivity2::class.java))
        }

        findViewById<ImageView>(R.id.googlelogo).setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
        }
        findViewById<ImageView>(R.id.twitterlogo).setOnClickListener {
            startActivity(Intent(this,Main2Activity::class.java))
        }

        findViewById<ImageView>(R.id.fblogo).setOnClickListener {
        startActivity(Intent(this,Main2Activity::class.java))
    }

        findViewById<com.google.android.material.button.MaterialButton>(R.id.loginbtn).setOnClickListener {
            var mail = email.text.toString()
            var pass = password.text.toString()
            if (mail == "") {
                Toast.makeText(this, "Please, Enter your Email!", Toast.LENGTH_SHORT).show()
            } else if (pass == "") {
                Toast.makeText(this, "Please, Enter your password!", Toast.LENGTH_SHORT).show()
            } else {
                textlogin.setTextColor(getColor(R.color.teal_200))


            }
        }
    }
}
