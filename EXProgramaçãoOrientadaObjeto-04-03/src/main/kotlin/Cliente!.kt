fun main(args: Array<String>) {
/*
1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
 em seguida crie um objeto cliente,
defina as instancias deste objeto e apresente as informações deste objeto no console.

 */

    /*
    val pCliente=Cliente()
    pCliente.nome="Laís"
    pCliente.idade = 28
    pCliente.sexo = "Feminino"
    pCliente.estadoCivil = "Casada"
    pCliente.email = "laisbalzack@gmail.com"
    pCliente.CPF = "258.965.782.06"
    pCliente.ndeFilhos = 1
    pCliente.corPref = "Roxo"
    pCliente.profissao = "fisioterapeuta"


    println("Nome - ${pCliente.nome}")
    println("Idade - ${pCliente.idade}")
    println("Sexo - ${pCliente.sexo}")
    println("Estado Civil - ${pCliente.estadoCivil}")
    println("E-mail - ${pCliente.email}")
    println("CPF - ${pCliente.CPF}")
    println("Número de Filhos - ${pCliente.ndeFilhos}")
    println("Cor Preferida - ${pCliente.corPref}")
    println("Profissão - ${pCliente.profissao}")
*/
    //Métodos

    val c = Cliente()

    println("Qual sua cor preferida?")
    val cp = readLine()!!

    c.cor(cp)

    println("Quantos filhos você tem?")
    val f = readLine()!!.toInt()

    c.ndeFilhos(f)

    println("Quantos anos você tem?")
    val i = readLine()!!.toInt()

    c.idade(i)

    println("Você tem $f filhos, $i de idade e sua cor preferida é $cp.")

}