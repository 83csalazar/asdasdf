package com.example.aaa

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RR_SS : AppCompatActivity() {

    private lateinit var botonFacebook: ImageButton
    private lateinit var botonInstagram: ImageButton
    private lateinit var botonWhatsApp: ImageButton
    private lateinit var smallButtonImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rr_ss)

        // Inicializar referencias a los botones de redes sociales
        botonFacebook = findViewById(R.id.botonRedSocial1)
        botonInstagram = findViewById(R.id.botonRedSocial2)
        botonWhatsApp = findViewById(R.id.botonRedSocial3)
        smallButtonImageView = findViewById(R.id.id_notificaciones)

        // Asignar clic listeners a los botones
        botonFacebook.setOnClickListener {
            abrirRedSocial("https://www.facebook.com/marcelapsanchez?locale=es_LA")
        }

        botonInstagram.setOnClickListener {
            abrirRedSocial("https://www.instagram.com/DulceAnhelatte/")
        }

        botonWhatsApp.setOnClickListener {
            abrirRedSocial("https://api.whatsapp.com/send?phone=+56941174046")
        }

        // Configurar clic listener para el botón Home
        val btnHome = findViewById<View>(R.id.buttonHome)
        btnHome.setOnClickListener {
            irAlMenuPrincipal()
        }

        // Configurar clic listener para el botón de Notificaciones
        smallButtonImageView.setOnClickListener {
            // Agrega aquí la lógica para manejar el clic en el botón de Notificaciones
            // Por ejemplo, mostrar una notificación o cambiar la vista según tus necesidades
        }
    }

    private fun abrirRedSocial(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }

    private fun irAlMenuPrincipal() {
        // Agrega aquí la lógica para ir al menú principal
        // Por ejemplo, puedes iniciar una nueva actividad que represente tu menú principal
        // o cambiar la vista actual según tus necesidades
        val intent = Intent(this, MenuPrincipal::class.java)
        startActivity(intent)
        finish() // Opcional: puedes finalizar esta actividad si no deseas volver a ella desde el menú principal
    }
}
