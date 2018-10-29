package com.example.android.app1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val resultado = findViewById<TextView>(R.id.resultado)
        val gasolina = findViewById<EditText>(R.id.gasolina)
        val alcool = findViewById<EditText>(R.id.alcool)

        val btnCalcular = findViewById<Button>(R.id.btncalcular)
        btnCalcular?.setOnClickListener {

            val valor1 = gasolina.text.toString().toDouble()
            val valor2 = alcool.text.toString().toDouble()

            val valorTotal = valor1 * 0.7

            if (valorTotal < valor2) resultado.text = getString(R.string.gasoline)
            else resultado.text = getString(R.string.alchool)

            Toast.makeText(this, valorTotal.toString(), Toast.LENGTH_LONG).show()
        }
    }

}
