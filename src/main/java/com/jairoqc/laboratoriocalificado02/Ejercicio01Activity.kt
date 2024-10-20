package com.jairoqc.laboratoriocalificado02

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jairoqc.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mostrar la vista verde al hacer clic en el botón "Mostrar"
        binding.btnShow.setOnClickListener {
            binding.greenView.visibility = View.VISIBLE
        }

        // Ocultar la vista verde al hacer clic en el botón "Ocultar"
        binding.btnHide.setOnClickListener {
            binding.greenView.visibility = View.GONE
        }
    }
}
