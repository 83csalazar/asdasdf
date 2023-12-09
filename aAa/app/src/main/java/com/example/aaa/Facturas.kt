package com.example.aaa

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class Facturas : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facturas)

        // Arreglo de opciones para el Spinner
        val opcionesDocumento = arrayOf("Boleta", "Factura")

        // Obtén una referencia al Spinner desde el diseño
        val spinnerTipoDocumento = findViewById<Spinner>(R.id.spinnerTipoDocumento)

        // Crear un adaptador para el Spinner
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opcionesDocumento)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTipoDocumento.adapter = adapter

        // Configurar el OnItemSelectedListener para el Spinner
        spinnerTipoDocumento.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>, selectedItemView: View, position: Int, id: Long) {
                // Puedes realizar acciones específicas si es necesario cuando se selecciona un elemento
            }

            override fun onNothingSelected(parentView: AdapterView<*>) {
                // Manejar la situación en la que no se ha seleccionado nada
            }
        })

        // Obtener referencias a las vistas de fecha, monto y botón de imprimir
        val fechaEditText = findViewById<EditText>(R.id.editTextFecha)
        val montoEditText = findViewById<EditText>(R.id.editTextMonto)
        val botonImprimir = findViewById<Button>(R.id.botonImprimir)
        val btnhome = findViewById<View>(R.id.buttonHome)
        val smallButtonImageView = findViewById<ImageView>(R.id.id_notificaciones)


        // Configurar el OnClickListener para el botón de imprimir
        botonImprimir.setOnClickListener {
            // Obtener el tipo de documento seleccionado
            val tipoDocumento = spinnerTipoDocumento.selectedItem as String

            // Obtener la fecha y el monto ingresados
            val fecha = fechaEditText.text.toString()
            val monto = montoEditText.text.toString()

            // Crear el mensaje a mostrar
            val mensaje = "$tipoDocumento - Fecha: $fecha - Monto: $monto"

            // Mostrar el mensaje en un Toast
            Toast.makeText(this@Facturas, mensaje, Toast.LENGTH_SHORT).show()
        }

        // Configurar el OnClickListener para el botón Home
        btnhome.setOnClickListener {
            // Crear un Intent para volver a la actividad MenuPrincipal
            val intent = Intent(this@Facturas, MenuPrincipal::class.java)
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
