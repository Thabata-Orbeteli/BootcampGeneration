import CRetorno.Calculadora

fun main(){

    println("Olá!")
    Calculadora.menu()

    println("......")

    println("Você deseja voltar ao menu anterior? \n 1-Sim \n 2-Não")
    val menu = readLine()!!.toInt()

    when (menu) {
        1 -> println(menu)
        2 -> println("Finalizado.")
    }
}

