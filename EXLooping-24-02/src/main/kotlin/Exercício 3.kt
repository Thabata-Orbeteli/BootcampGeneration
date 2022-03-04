fun main(){
    /*
    Exercício 3
    Solicitar a idade de várias pessoas e imprimir:
    Total de pessoas com menos de 21 anos.
    Total de pessoas com mais de 50 anos.
    O programa termina quando idade for =-99. (WHILE)
     */

    var idade = 0
    var soma21 = 0
    var soma50 = 0
    var num = 0

    while(idade != -99){
        print("Digite sua idade:")
        idade = readLine()!!.toInt()

        if(idade <= 21){
            soma21 += num
        }else if(idade >=50){
            soma50 += num
        }
    }
    println("A quantidade de pessoas com menos de 21 é $soma21.")
    println("A quantidade de pessoas com mais de 50 é $soma50.")

}