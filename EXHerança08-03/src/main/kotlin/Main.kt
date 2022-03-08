import animais.Animal
import animais.cavalo
import animais.dog
import animais.preguica

fun main() {
    /*
    Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
    utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
    fique na classe Animal.

    Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque o método que emite
    o som de cada um de forma polimórfica, isto é, independente do tipo de animal.

     */

    val dog = dog("Lunna", 10, "Mini Schnauzer")
    val cavalo = cavalo("Bolt", 5, 1.80)
    val preguica = preguica("Brisa", 8)

    while (true) {
        println("\n***Menu***\n")

        println("1 - Som do Cachorro")
        println("2 - Som do Cavalo")
        println("3 - Som da Preguiça")
        println("Digite qualquer outra coisa para sair")

        var opc = 0

        while (true) {
            println("\nDigite a opção desejada: ")

            try {
                opc = readLine()!!.toInt()
                break
            } catch (e: Exception) {
                println("Valor inválido")
            }
        }

        when (opc) {

            1 -> println(" ${dog.som()}")
            2 -> println(" ${cavalo.som()}")
            3 -> println(" ${preguica.som()}")
        }

    }
}

