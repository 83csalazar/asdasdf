package com.example.aaa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        val correctUsername = "marcela"
        val correctPassword = "123"

        loginButton.setOnClickListener {
            val enteredUsername = usernameEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            if (enteredUsername == correctUsername && enteredPassword == correctPassword) {
                // Credenciales correctas
                Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()

                // Navegar a la actividad MenuPrincipal
                val intent = Intent(this, MenuPrincipal::class.java)
                startActivity(intent)

            } else {
                // Credenciales incorrectas
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        exitButton.setOnClickListener {
            finish() // Cierra la aplicación al hacer clic en el botón "Salir"
        }
    }
}
