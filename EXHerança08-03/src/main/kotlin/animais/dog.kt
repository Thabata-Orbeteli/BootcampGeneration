package animais

class dog (nome: String, idade: Int, var raca:String):Animal(nome,idade) {

    override fun correr() {
        println("O cachorro está correndo.")
    }

    override fun som() {
        println("O cachorro faz Au,au,au")
    }
    
}


