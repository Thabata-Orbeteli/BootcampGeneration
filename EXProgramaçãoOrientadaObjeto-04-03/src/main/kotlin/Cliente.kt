class Cliente {

    var nome = ""
    var idade = 0
    var sexo = ""
    var estadoCivil = ""
    var email = ""
    var CPF = ""
    var ndeFilhos = 0
    var corPref = ""
    var profissao = ""

    fun cor (valor: String){
        if(valor == "branco"){
            println("Cor inválida")
        }else{
            println("Cor $corPref com sucesso!")
        }
    }

    fun idade (valor: Int){
        if(idade < 0){
            println("Idade inválida!")
        }else if(valor < 18){
            println("Salvo! Você é menor de idade!")
        }else{
            println("Salvo! Você é maior de idade!")
        }
    }


    fun ndeFilhos (valor: Int){
        if(ndeFilhos == 0){
            println("Salvo! Você não tem filhos!")
        }else if(valor < 0){
            println("Quantidade inválida")
        }else {
            println("Salvo! Você tem $ndeFilhos!")
        }
    }
}

