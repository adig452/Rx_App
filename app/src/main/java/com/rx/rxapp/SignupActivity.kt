package com.rx.rxapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {

    lateinit var bRegister: Button
    lateinit var tvLoginUser: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        bRegister = findViewById(R.id.bRegister)
        tvLoginUser = findViewById(R.id.tvLoginUser)

        bRegister.setOnClickListener {
            val intent = Intent(this@SignupActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

        tvLoginUser.setOnClickListener {
            val intent = Intent(this@SignupActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}