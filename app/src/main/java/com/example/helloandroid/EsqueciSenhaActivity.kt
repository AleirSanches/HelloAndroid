package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.helloandroid.domair.EsqueciSenhaService
import com.example.helloandroid.extensions.alert

class EsqueciSenhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esqueci_senha)
        findViewById<Button>(R.id.btenviar).setOnClickListener {
            onClickEnviar()
        }
    }
    private fun onClickEnviar(){
        val tLogin = findViewById<TextView>(R.id.tLogin)
        val login = tLogin.text.toString()
        val service = EsqueciSenhaService()
        val ok: Boolean = service.recuperarSenha(login)
        if (ok){
            alert("sua nova senha foi enviada para seu e-mail")
            finish()
        }
        else {
            alert ("Ocorreu um erro ao recuperar senha")
        }
    }
}