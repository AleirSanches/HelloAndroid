package com.example.helloandroid.extensions

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDialog


fun AppCompatActivity.alert ( msg: String){

    val dialog = AlertDialog.Builder(this).create()
    dialog.setTitle("Adroid")
    dialog.setMessage("Login incorreto, digite os dados novamente")
    dialog.setButton(
        AlertDialog.BUTTON_NEUTRAL, "OK"
    ) { _, which -> dialog.desmiss() }

    dialog.show()


}

private fun AppCompatDialog.desmiss() {
    TODO("Not yet implemented")
}



