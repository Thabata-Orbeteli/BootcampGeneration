fun main(){

    /* Exercício 3:
    Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
    -10-14 infantil
    -15-17 juvenil
    -18-25 adulto
     */

    print("Olá! Digite o seu nome:")
    val nome = readLine()!!

    print("Digite a sua idade:")
    val idade = readLine()!!.toInt()

    when (idade) {
        in 10..14 -> print("$nome, voce é da categoria infantil.")
        in 15..17 -> print("$nome, voce é da categoria juvenil.")
        in 18..25 -> print("$nome, voce é da categoria adulto.")
        else -> print("$nome, você não se enquandra em nenhuma categoria.")
    }


}