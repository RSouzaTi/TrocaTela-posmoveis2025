package br.edu.utfpr.trocatela_posmoveis2025

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }

fun btLançamentoOnClick(view: View) {
    val intent = Intent(this, LancamentoActivity::class.java)
    startActivity(intent)

}
}