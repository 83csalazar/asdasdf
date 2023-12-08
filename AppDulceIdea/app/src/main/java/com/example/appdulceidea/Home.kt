package com.example.appdulceidea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btn1: ImageButton = findViewById(R.id.btn_Factura)
        val btn2: ImageButton = findViewById(R.id.btn_Ingredientes)
        val btn3: ImageButton = findViewById(R.id.btn_Recetas)
        val btn4: ImageButton = findViewById(R.id.btn_IngrUser)
        val btn5: ImageButton = findViewById(R.id.btn_Reporte)
        val btn6: ImageButton = findViewById(R.id.btn_inventario)
        val btn7: ImageButton = findViewById(R.id.btn_Notificacion)

        btn1.setOnClickListener {
            val intent = Intent(this, Factura::class.java)
            startActivity(intent)
            finish()
        }

        btn2.setOnClickListener {
            val intent = Intent(this, Ingredientes::class.java)
            startActivity(intent)
            finish()
        }

        btn3.setOnClickListener {
            val intent = Intent(this, Recetas::class.java)
            startActivity(intent)
            finish()
        }

        btn4.setOnClickListener {
            val intent = Intent(this, Imagen5::class.java)
            startActivity(intent)
            finish()
        }

        btn5.setOnClickListener {
            val intent = Intent(this, Imagen6::class.java)
            startActivity(intent)
            finish()
        }
        btn6.setOnClickListener {
            val intent = Intent(this, Imagen7::class.java)
            startActivity(intent)
            finish()
        }

        btn7.setOnClickListener {
            val intent = Intent(this, Imaen8::class.java)
            startActivity(intent)
            finish()
        }
    }
}

