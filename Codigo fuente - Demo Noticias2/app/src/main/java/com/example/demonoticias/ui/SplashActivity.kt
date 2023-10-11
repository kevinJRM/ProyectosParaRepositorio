package com.example.demonoticias.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.demonoticias.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({

            var userName = "kevin"

            var prefs = getSharedPreferences("com.example.demoNoticias.ui.demoNoticias.sharedpref", Context.MODE_PRIVATE)
            prefs.edit().putString("user",userName).apply()

            var intent = Intent(this, MainActivity::class.java)

            intent.putExtra("ID",123456)
            startActivity(intent)
            finish()
        },1000)

        //hola

    }
}