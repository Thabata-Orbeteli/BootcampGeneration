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
    menu()
    println("......")

    println("Você deseja voltar ao menu anterior? \n (Sim ou Não)")
    val menu = readLine()!!

    when (menu) {
        "Sim" -> menu()
        "sim" -> menu()
        "Não" -> println("Finalizado.")
        "não" -> println("Finalizado.")
    }
}

fun armazenar(){
    while (true) {
        val arm = mutableListOf<String>()
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

fun remover(){
    while (true) {
        val arm = mutableListOf<String>()
        print("\nRemova algum dado que você adicionou dentro da lista: ")
        val dado = readLine()!!

        if (arm.contains(dado)) {
            arm.remove(dado)
            break
            println("Dado $dado removido com sucusso!")

        } else {
            println("O nome $dado não existe na lista")
        }
    }
}

fun atualizar(){
    val arm = mutableListOf<String>()
    while (true) {

        print("Adicione um dado na lista: ")
        val dado = readLine()!!

        if (dado.isEmpty()) {
            break
            println("Dado $dado atualizado com sucusso!")
        } else {
            arm.add(dado)
        }
    }
}

fun apresentar(){
    val arm = mutableListOf<String>()
    print(arm)
}

fun menu() {
    println("As opções são:\n -Armazenar dados \n -Remover dados\n -Atualizar dados\n -Apresentar todos os dados ")
    println("Digite a opção escolhida:")
    val opc = readLine()!!

    when (opc) {
        "Armazenar dados" -> armazenar()
        "armazenar dados" -> armazenar()
        "Remover dados" -> remover()
        "remover dados" -> remover()
        "Atualizar dados" -> atualizar()
        "atualizar dados" -> atualizar()
        "Apresentar todos os dados" -> apresentar()
        "apresentar todos os dados" -> apresentar()
    }
}

//O código funciona, mas por estar em dentro de funções, ele não forma listas :(




