package com.example.android.app1

import android.widget.Toast
import android.widget.EditText
import android.os.Bundle
import android.widget.Button
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {




    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Resultado = findViewById<TextView>(R.id.resultado)
        var Gasolina = findViewById<EditText>(R.id.gasolina)
        var Alcool = findViewById<EditText>(R.id.alcool)

        val btnCalcular = findViewById<Button>(R.id.btncalcular)
        btnCalcular?.setOnClickListener {

             val valor1 = Gasolina.text.toString().toDouble()
             val valor2 = Alcool.text.toString().toDouble()

             val valorTotal = valor1 * 0.7

            if(valorTotal < valor2){
                Resultado.text = "A Gasolina é Melhor"
            }
            else{

                Resultado.text = "O Etanol é Melhor"

            }

            Toast.makeText(this@MainActivity, valorTotal.toString(), Toast.LENGTH_LONG).show()
        }
    }

}
