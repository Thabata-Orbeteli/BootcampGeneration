fun main(){

    /*Exercício 1
     Faça um programa que receba três inteiros e diga qual deles é o maior.
     */

    print("Digite um número: ")
    val n1 = readLine()!!.toInt()
    print("Digite um número: ")
    val n2 = readLine()!!.toInt()
    print("Digite um número: ")
    val n3 = readLine()!!.toInt()

    if(n1>n2 && n1>n3){
        print("O maior número é $n1.")
    }else if(n2>n1 && n2>n3){
        print("O maior número é $n2.")
    }else {
        println("O maior número é $n3.")
    }
}