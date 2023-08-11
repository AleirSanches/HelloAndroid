package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

// novo comentario
// novo comentario teste 2
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bLogin).setOnClickListener {
            onClickLogin()

        }


        findViewById<TextView>(R.id.btEsqueciSenha).setOnClickListener {

             startActivity(Intent(this,EsqueciSenhaActivity::class.java))
        }

        findViewById<TextView>(R.id.btCadastre_se).setOnClickListener {
            startActivity(Intent(this,CadastroActivity::class.java))
        }


    }

    fun onClickLogin() {


        val tLogin = findViewById<TextView>(R.id.tusuario)
        val tSenha = findViewById<TextView>(R.id.tsenha)
        val login = tLogin.text.toString()
        val senha = tSenha.text.toString()
        if (login == "aleir" && senha == "123") {
            startActiviy(Intent(this, HomeActivity::class.java))
        } else {

        }
    }
    // comentario

    private fun startActiviy(intent: Intent) {

    }
}
