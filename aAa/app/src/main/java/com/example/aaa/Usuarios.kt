package com.example.aaa

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.Toast

class Usuarios : AppCompatActivity() {

    //-private val databaseHelper: DatabaseHelper = DatabaseHelper(this)
    //-private lateinit var recyclerView: RecyclerView
    //-private lateinit var usuarioAdapter: UsuarioAdapter // Ajusta el nombre del adaptador según tu implementación

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuarios)

        // Obtén referencias a los elementos de la interfaz de usuario
        val botonAgregar = findViewById<ImageButton>(R.id.botonAgregar)
        val botonEliminar = findViewById<ImageButton>(R.id.botonEliminar)
        val botonModificar = findViewById<ImageButton>(R.id.botonModificar)

        // Configura el RecyclerView
        //recyclerView = findViewById(R.id.recyclerViewUsuarios)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        //usuarioAdapter = UsuarioAdapter() // Ajusta el nombre del adaptador según tu implementación
        //recyclerView.adapter = usuarioAdapter

        // Configura el botón Agregar
        botonAgregar.setOnClickListener {
            // Aquí debes implementar la lógica para agregar un usuario a la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // databaseHelper.agregarUsuario(nuevoUsuario)
            // usuarioAdapter.actualizarDatos(databaseHelper.obtenerTodosLosUsuarios())
        }

        // Configura el botón Eliminar
        botonEliminar.setOnClickListener {
            // Aquí debes implementar la lógica para eliminar un usuario de la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // databaseHelper.eliminarUsuario(usuarioAEliminar)
            // usuarioAdapter.actualizarDatos(databaseHelper.obtenerTodosLosUsuarios())
        }

        // Configura el botón Modificar
        botonModificar.setOnClickListener {
            // Aquí debes implementar la lógica para modificar un usuario en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // databaseHelper.modificarUsuario(usuarioModificado)
            // usuarioAdapter.actualizarDatos(databaseHelper.obtenerTodosLosUsuarios())
        }
    }
}
