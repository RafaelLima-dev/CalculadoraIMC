package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edialtura = findViewById<TextInputEditText>(R.id.edi_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)


        btncalcular.setOnClickListener {

            val pesoStr: String = edtpeso.text.toString()
            val alturaStr: String = edialtura.text.toString()

            if (pesoStr.isEmpty() || alturaStr.isEmpty()) {

                Snackbar.make(
                    edtpeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()
            } else {
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()
                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)


                println("Rafael açao do botao" + resultado)
            }
        }
    }
}