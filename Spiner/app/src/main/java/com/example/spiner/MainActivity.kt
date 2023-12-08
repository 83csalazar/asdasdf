package com.example.spiner
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class CategoryItem(val title: String, val imageResource: Int, val description: String)

class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var spinner: Spinner

    private val comidaItems = listOf(
        CategoryItem("Pizza", R.drawable.pizza_image, "Deliciosa pizza recién horneada."),
        // Agregar más elementos a la lista para la categoría "Comida"
    )

    private val deportesItems = listOf(
        CategoryItem("Fútbol", R.drawable.football_image, "Disfruta jugando al fútbol con tus amigos."),
        // Agregar más elementos a la lista para la categoría "Deportes"
    )

    // Puedes definir más listas para otras categorías aquí

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.spinnerCategories)
        recyclerView = findViewById(R.id.recyclerView)

        val categories = resources.getStringArray(R.array.categories_array)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedCategoryItems = when (position) {
                    0 -> comidaItems // Cargar datos para la categoría "Comida"
                    1 -> deportesItems // Cargar datos para la categoría "Deportes"
                    // Definir casos para otras categorías según sea necesario
                    else -> emptyList() // Si no hay datos para la categoría seleccionada
                }

                val adapter = CategoryAdapter(selectedCategoryItems)
                recyclerView.adapter = adapter
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Acción a realizar cuando no se ha seleccionado ninguna categoría
            }
        }
    }

}