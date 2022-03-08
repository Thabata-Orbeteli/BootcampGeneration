package animais

class preguica (nome: String, idade: Int):Animal(nome,idade) {

    override fun correr() {
        println("A preguiça está correndo")
    }

    override fun som() {
        println("A preguiça faz som de grunhido")
    }

    fun subir(valor:String) {
    }
}