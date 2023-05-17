package com.example.ken_job

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btntoregister: Button
    lateinit var btntologin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btntoregister = findViewById(R.id.st_btn_register)
        btntologin = findViewById(R.id.st_btn_log_in)



        btntoregister.setOnClickListener {
            val gotoregister = Intent(this, RegistrationActivity::class.java)
            startActivity(gotoregister)
            finish()
        }
        btntologin.setOnClickListener {
            val gotologin = Intent(this, LoginActivity::class.java)
            startActivity(gotologin)
            finish()
        }

    }


}