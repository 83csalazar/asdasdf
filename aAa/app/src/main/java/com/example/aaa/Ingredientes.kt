package com.example.aaa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Ingredientes : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //-private lateinit var ingredienteAdapter: IngredienteAdapter // Ajusta el nombre del adaptador según tu implementación

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingredientes)

        // Obtén referencias a los elementos de la interfaz de usuario
        val botonAgregar = findViewById<ImageButton>(R.id.botonAgregar)
        val botonEliminar = findViewById<ImageButton>(R.id.botonEliminar)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)
        val btnhome = findViewById<View>(R.id.buttonHome)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)

        // Configura el RecyclerView
        recyclerView = findViewById(R.id.recyclerViewIngredientes)
        recyclerView.layoutManager = LinearLayoutManager(this)
       //- ingredienteAdapter = IngredienteAdapter() // Ajusta el nombre del adaptador según tu implementación
        //-recyclerView.adapter = ingredienteAdapter

        // Configura el botón Agregar
        botonAgregar.setOnClickListener {
            // Aquí debes implementar la lógica para agregar un ingrediente a la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // ingredienteAdapter.agregarIngrediente(nuevoIngrediente)
        }

        // Configura el botón Eliminar
        botonEliminar.setOnClickListener {
            // Aquí debes implementar la lógica para eliminar un ingrediente de la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // ingredienteAdapter.eliminarIngrediente(ingredienteAEliminar)
        }

        // Configura el botón Modificar
        botonModificar.setOnClickListener {
            // Aquí debes implementar la lógica para modificar un ingrediente en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // ingredienteAdapter.modificarIngrediente(ingredienteModificado)
        }
        // Configurar el OnClickListener para el botón Home
        btnhome.setOnClickListener {
            // Crear un Intent para volver a la actividad MenuPrincipal
            val intent = Intent(this@Ingredientes, MenuPrincipal::class.java)
            startActivity(intent)

            // Finalizar la actividad actual (Facturas)
            finish()
        }
        // Configurar OnClickListener para el botón de notificaciones
        smallButtonImageView.setOnClickListener {
            mostrarMensajeNotificaciones()
        }

        // Aquí puedes realizar otras configuraciones adicionales según tus necesidades
        // Por ejemplo, configurar los listeners de los demás botones, cambiar el texto de las vistas, etc.
    }

    private fun mostrarMensajeNotificaciones() {
        // Puedes mostrar un mensaje usando un AlertDialog o un Toast
        // En este ejemplo, se utiliza Toast para mostrar un mensaje efímero.
        Toast.makeText(this, "No hay notificaciones pendientes", Toast.LENGTH_SHORT).show()
    }
}
