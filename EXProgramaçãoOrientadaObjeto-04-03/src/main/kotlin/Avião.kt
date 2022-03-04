class Avião {
    var cor = ""
    var motor =""
    var ano = 0
    var voo = ""
    var ciaarea = ""
    var modelo = ""

    fun idade (valor: Int){
        if(ano >= 2010){
            println("O avião é bem novo!")
        }else{
            println("O avião é velho!")
        }
    }

    fun voo (valor: String){
        if(voo == "internacional" || voo == "Internacional"){
            println("A aeronave faz voos internacionais!")
        }else{
            println("A aeronave faz voos nacionais!")
        }
    }



}