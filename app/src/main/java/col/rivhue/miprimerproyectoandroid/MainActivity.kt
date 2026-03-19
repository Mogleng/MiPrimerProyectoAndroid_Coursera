package col.rivhue.miprimerproyectoandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textViewBienvenida: TextView
    private lateinit var buttonEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewBienvenida = findViewById(R.id.textViewBienvenida)
        buttonEntrar = findViewById(R.id.buttonEntrar)

        // Al presionar el botón, cambia el texto del TextView
        buttonEntrar.setOnClickListener {
            textViewBienvenida.text = getString(R.string.button_text)
        }
    }
}
