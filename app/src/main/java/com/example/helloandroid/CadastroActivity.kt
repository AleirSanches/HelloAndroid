package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.helloandroid.domair.CadastroService
import com.example.helloandroid.extensions.alert
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
    }
}
private fun onClickCadastrar(){
    val termosOk = checkTermo.isChecked
    if (!termosOK){
        alert("Aceite os termos")
    }
    else{
        val model= getCadastroModel()
        val service= CadastroService()
        val ok: Boolean = service.cadastrar(model)
        if (ok){
            alert("Cadastro realizado com sucesso")
            finish()
        }
        else{
            alert("Ocorreu um erro ao cadastrar")
        }
    }
    private fun getCadastroModel(){

    }

}