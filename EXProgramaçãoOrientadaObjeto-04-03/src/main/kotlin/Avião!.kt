fun main(){

    val av=Avião()
    av.cor="Preto"
    av.ano=2005
    av.voo="internacional"
    av.ciaarea="Latam"
    av.motor= "Pulso detonação"
    av.modelo="Gulfstream G500 "

    println("Cor - ${av.cor}")
    println("Ano - ${av.ano}")
    println("Vôo - ${av.voo}")
    println("Cia Aérea - ${av.ciaarea}")
    println("Motor - ${av.motor}")
    println("Modelo - ${av.modelo}")

    //Métodos

    val a = Avião()

    println("Qual o ano de fabricação da aeronave?")
    val af = readLine()!!.toInt()

    a.idade(af)

    println("A aeronave faz voo internacionais ou nacionais?")
    val vi = readLine()!!

    a.voo(vi)

}



