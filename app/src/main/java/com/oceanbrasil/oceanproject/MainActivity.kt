package com.oceanbrasil.oceanproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btEnviar.setOnClickListener {
            enviar()
        }
    }

    private fun enviar() {
        val nome = etNome.text.toString()

        if (nome != "") {

//            Toast.makeText(this, nome, Toast.LENGTH_LONG).show()
//            longToast(nome)
//            layout.snackbar(nome)
            /*alert ("Seu nome é: $nome", "Exibição do nome") {

                yesButton {  }
            }.show()*/
           /* val intent = Intent(this, DetalhesActivity::class.java)

            intent.putExtra("Nome", nome)
            startActivity(intent)*/

            startActivity<DetalhesActivity>("NOME" to 5)

        } else {
            etNome.error = "Por gentileza, digite o seu nome"
        }
    }
}
