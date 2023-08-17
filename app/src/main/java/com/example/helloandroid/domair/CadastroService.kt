package com.example.helloandroid.domair

import android.util.Log

class CadastroService {
    fun cadastrar( model: CadastroModel): Boolean {
        Log.d ("empresa", "Cadastro $model")
        return true
    }
}