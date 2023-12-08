package com.example.aaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ImageButton
import android.widget.TextView

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        val logoImageView = findViewById<ImageView>(R.id.id_Logo)
        val tituloTextView = findViewById<TextView>(R.id.id_Titulo)
        val subtituloTextView = findViewById<TextView>(R.id.id_Subtítulo)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)

        val button1 = findViewById<ImageButton>(R.id.buttonFactura)
        val button2 = findViewById<ImageButton>(R.id.buttonIgredienntes)
        val button3 = findViewById<ImageButton>(R.id.buttonInventario)
        val button4 = findViewById<ImageButton>(R.id.buttonUsuario)
        val button5 = findViewById<ImageButton>(R.id.buttonRecetas)
        val button6 = findViewById<ImageButton>(R.id.buttonValance)

        val centerButton = findViewById<ImageButton>(R.id.buttonHome)

        // Configurar OnClickListener para el botón de factura
        button1.setOnClickListener {
            // Crear un Intent para iniciar la actividad Facturas
            val intent = Intent(this, Facturas::class.java)
            startActivity(intent)
        }

        // Aquí puedes realizar cualquier otra configuración adicional que necesites
        // Por ejemplo, configurar los listeners de los demás botones, etc.
    }
}
