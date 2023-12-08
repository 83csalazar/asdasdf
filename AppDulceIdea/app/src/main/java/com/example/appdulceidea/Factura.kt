package com.example.appdulceidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Factura : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_factura)

            val btn1: ImageButton = findViewById(R.id.btn_print)
            val btn2: ImageButton = findViewById(R.id.btn_home)
            val btn5: ImageButton = findViewById(R.id.btn_Notificacion)

            btn1.setOnClickListener {
                val intent = Intent(this, Factura::class.java)
                startActivity(intent)
                finish()
            }

            btn2.setOnClickListener {
                val intent = Intent(this, Home::class.java)
                startActivity(intent)
                finish()
            }

            btn5.setOnClickListener {
                val intent = Intent(this,Login::class.java)
                startActivity(intent)
                finish()
            }
        }
    }