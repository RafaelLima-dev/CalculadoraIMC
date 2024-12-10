package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Recuperar os componentes edit text
        //Criar uma variavel e associar o componente de UI<Edittext>
        // Recuperar Ibotao da tela
        // Colocar açao do botao setOnclicklistener
        // Recuperar texto digitano no edit peso
        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edialtura = findViewById<TextInputEditText>(R.id.edi_altura)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)


        btncalcular.setOnClickListener {
            val peso = edtpeso.text
            val altura = edialtura.text


        }
    }
}