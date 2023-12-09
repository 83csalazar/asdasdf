package com.example.aaa

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Inventario : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    //private lateinit var inventarioAdapter: InventarioAdapter // Ajusta el nombre del adaptador según tu implementación

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventario)

        // Obtén referencias a los elementos de la interfaz de usuario
        val btnhome = findViewById<View>(R.id.buttonHome)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)

        // Configura el RecyclerView
       // recyclerView = findViewById(R.id.recyclerViewInventario)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        //inventarioAdapter = InventarioAdapter() // Ajusta el nombre del adaptador según tu implementación
        //recyclerView.adapter = inventarioAdapter

        // Configura el botón Agregar
        //botonAgregar.setOnClickListener {
            // Aquí debes implementar la lógica para agregar un elemento al inventario en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // inventarioAdapter.agregarElemento(nuevoElemento)
        }

        // Configura el botón Eliminar
        //botonEliminar.setOnClickListener {
            // Aquí debes implementar la lógica para eliminar un elemento del inventario en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // inventarioAdapter.eliminarElemento(elementoAEliminar)
        }

        // Configura el botón Modificar
        //botonModificar.setOnClickListener {
            // Aquí debes implementar la lógica para modificar un elemento del inventario en la base de datos
            // Luego, actualiza el RecyclerView
            // Por ejemplo:
            // inventarioAdapter.modificarElemento(elementoModificado)
       // }
    //}
//}