package com.karnag.trabajoconoperadores

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.karnag.trabajoconoperadores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val miNumero:EditText=findViewById(R.id.editTextText)
        val miBoton:Button=findViewById(R.id.button)
        val textoResultado:TextView=findViewById(R.id.textView2)

        miBoton.setOnClickListener{

            val numeroResultado=miNumero.text.toString().toIntOrNull()

            if(numeroResultado==null)
                textoResultado.text= "Intruduce un numero"

            else if(numeroResultado<18)
                textoResultado.text= "Eres menor de edad"

            else if (numeroResultado>18)
                textoResultado.text="Eres mayor de edad"

            else textoResultado.text="Tienes justo 18 años"

        }


    }

}