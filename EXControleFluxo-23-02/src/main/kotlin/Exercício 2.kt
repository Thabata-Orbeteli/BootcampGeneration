fun main(){

    /*Exercício 2
    Faça um programa que entre com três números e coloque em ordem crescente.
     */

    print("Digite um número: ")
    val n1 = readLine()!!.toDouble()
    print("Digite um número: ")
    val n2 = readLine()!!.toDouble()
    print("Digite um número: ")
    val n3 = readLine()!!.toDouble()

    if(n1 <= n2 && n1 <= n3 && n2<=n3){
        print("A ordem é $n1,$n2,$n3")
    }else if(n1 <= n2 && n1 <= n3 && n3 <= n2){
        print("A ordem é $n1,$n3,$n2")
    }else if(n2 <= n1 && n2 <= n3 && n1<n3){
        print("A ordem é $n2,$n1,$n3")
    }else if(n2 <= n1 && n2 <= n3 && n3 <= n1 ){
        print("A ordem é $n2,$n3,$n1")
    }else if(n3 <= n1 && n3 <= n2 && n1 <= n2){
        print("A ordem é $n3,$n1,$n2")
    }else{
        println("A ordem é $n3,$n2,$n1.")
    }

}