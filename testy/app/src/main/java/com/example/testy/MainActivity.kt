package com.example.testy
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val options = listOf(
            Option("Opción 1", R.drawable.img1),
            Option("Opción 2", R.drawable.img2),
            Option("Opción 3", R.drawable.img3),
            Option("Opción 4", R.drawable.img4)
        )

        val adapter = OptionAdapter(options)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options.map { it.title })
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                // Handle item selection from the spinner if needed
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Handle situation where nothing is selected from the spinner if needed
            }
        }
    }
}
