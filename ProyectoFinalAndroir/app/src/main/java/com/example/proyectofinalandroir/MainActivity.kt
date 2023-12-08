package com.example.proyectofinalandroir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.usernameEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            //if (username == "profe" && password == "123456") {
            // Credenciales válidas, redirigir a la actividad Imagen1.
            //    val intent = Intent(this, Home::class.java)
            //    startActivity(intent)
            //   finish() // Cierra la actividad MainActivity
            //} else {
                // Mostrar un mensaje de error o hacer lo que corresponda en caso de credenciales incorrectas.
                // Por ejemplo, mostrar un Toast.
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
