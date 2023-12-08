import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    private val images = arrayOf(
        R.drawable.imagen1, // Cambia a tus imágenes
        R.drawable.imagen2,
        R.drawable.imagen3,
        R.drawable.imagen4
    )

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val btnPrevious = findViewById<Button>(R.id.btnPrevious)
        val btnNext = findViewById<Button>(R.id.btnNext)

        imageView.setImageResource(images[currentIndex])

        btnPrevious.setOnClickListener {
            if (currentIndex > 0) {
                currentIndex--
                imageView.setImageResource(images[currentIndex])
            }
        }

        btnNext.setOnClickListener {
            if (currentIndex < images.size - 1) {
                currentIndex++
                imageView.setImageResource(images[currentIndex])
            }
        }
    }
}
