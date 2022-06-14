package ac.id.atmaluhur.mhs.customallertdialog_vivinalia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKenalan = findViewById<Button>(R.id.btnKenalan)

        btnKenalan.setOnClickListener {
            val inflateView = layoutInflater.inflate(R.layout.layoutalertdialog, null)
            val etNama = inflateView.findViewById<EditText>(R.id.etNama)
            val alb = AlertDialog.Builder(this@MainActivity)
            with(alb) {
                setTitle("Mau kenalan")
                setIcon(R.drawable.kotlin)
                setView(inflateView)
                setCancelable(false)
                setPositiveButton("selesai") { _, _ ->
                    val nama = if ("${etNama.text}".isNotEmpty()) "${etNama.text}" else "orang asing"
                    Toast.makeText(this@MainActivity, "salam kenal, $nama", Toast.LENGTH_SHORT)
                        .show()

                }
                setNegativeButton("siape lu?") { _, _ ->
                    Toast.makeText(this@MainActivity, "sombong amat sih!", Toast.LENGTH_SHORT)
                        .show()
                }
                setNeutralButton("Maaf, cuma numpang lewat", null)
                create().show()
            }
        }
    }
}