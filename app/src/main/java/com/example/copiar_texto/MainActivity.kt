package com.example.copiar_texto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.copiar_texto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showButton.setOnClickListener {
            val message = binding.message.text
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            binding.textView.setText("Bienvenido" + " " + message)
        }

        binding.delButton.setOnClickListener {
             binding.message.text.clear()
        }

    }

}