package animais

abstract class Animal (var nome: String, var idade: Int) {

    abstract fun correr()

   fun subir(){
       println("A preguiça sobe em árvores")
    }

    abstract fun som()
}

