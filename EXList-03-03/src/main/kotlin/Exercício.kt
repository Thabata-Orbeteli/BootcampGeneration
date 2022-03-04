fun main() {

    /*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    -Armazenar dados da List
    -Remover dados da list
    -Atualizar dados da list.
    -Apresentar todos os dados da list.

     */

    val arm = mutableListOf<String>()
    println("Olá!")
    menu(arm)
    println("......")

    do {

    println("Você deseja voltar ao menu anterior? \n (Sim ou Não)")
    val menu = readLine()!!

    when (menu) {
        "Sim" -> menu(arm)
        "sim" -> menu(arm)
        "Não" -> println("Finalizado.")
        "não" -> println("Finalizado.")
    }
}while(menu.compareTo("sim",true)==0)
}

fun armazenar(arm:MutableList<String>){
    while (true) {
        print("Adicione um dado na lista: ")
        val dado = readLine()!!

        if (dado.isEmpty()) {
            break
            print("Você deseja voltar ao menu anterior? \n (Sim ou Não)")

        } else {
            arm.add(dado)
        }

    }
}

fun remover(arm:MutableList<String>){
    while (true) {
        print("\nRemova algum dado que você adicionou dentro da lista: ")
        val dado = readLine()!!

        if (arm.contains(dado)) {
            arm.remove(dado)
            break
            println("Dado $dado removido com sucesso!")

        } else {
            println("O nome $dado não existe na lista")
        }
    }
}

fun atualizar(arm:MutableList<String>){
    while (true) {

        print("Adicione um dado na lista: ")
        val dado = readLine()!!

        if (dado.isEmpty()) {
            break
            println("Dado $dado atualizado com sucesso!")
        } else {
            arm.add(dado)
        }
    }
}

fun apresentar(arm:MutableList<String>){
    print(arm)
}

fun menu(arm:MutableList<String>) {
    println("As opções são:\n -Armazenar dados \n -Remover dados\n -Atualizar dados\n -Apresentar todos os dados ")
    println("Digite a opção escolhida:")
    val opc = readLine()!!

    when (opc) {
        "Armazenar dados" -> armazenar(arm)
        "armazenar dados" -> armazenar(arm)
        "Remover dados" -> remover(arm)
        "remover dados" -> remover(arm)
        "Atualizar dados" -> atualizar(arm)
        "atualizar dados" -> atualizar(arm)
        "Apresentar todos os dados" -> apresentar(arm)
        "apresentar todos os dados" -> apresentar(arm)
        else -> println("deu ruim")
    }
}

//O código funciona, mas por estar em dentro de funções, ele não forma listas :(




