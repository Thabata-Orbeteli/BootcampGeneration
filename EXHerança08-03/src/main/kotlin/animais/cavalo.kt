package animais

class cavalo(nome: String, idade: Int, var altura:Double):Animal(nome,idade){

    override fun correr(){
        println("O cavalo está correndo")
    }

    override fun som(){
        println(" Iiirrrí")
    }

}
