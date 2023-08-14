package com.example.helloandroid.domair

class LoginService {
    fun login(login: String, senha: String): Usuario? {
        if (login == "aleir " && senha == "1234") {
            return Usuario("Aleir", "a@a.com")
        } else if (login == "teste " && senha == "123") {
            return Usuario("teste", "b@b.com")
        }
        return null
    }
}

// comentario 2 agora
