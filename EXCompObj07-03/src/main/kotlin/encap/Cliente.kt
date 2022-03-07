package encap

/*
Cria uma Classe clientes.encap.Cliente, contendo os atributos encapsulados, um construtor padrão e
pelo menos mais duas opções de construtores conforme sua percepção,
com os atributos: nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
*/

class Cliente {
    class Cliente(private val nome: String) {

        private var telefone = ""
        private var endereco = ""

        var listaDeCompras = mutableListOf<String>()

        constructor(nome: String, telefone: String) : this(nome) {
            this.telefone = telefone
        }

        constructor(nome: String, telefone: String, endereco: String) : this(nome, telefone) {

            this.endereco = endereco
        }

        init {
            if (nome.isEmpty()) {
                throw Exception("A classe cliente não  foi instanciada corretamente")
            }
        }

        fun add(produto: String) {
            if (produto.isEmpty()) {
                println("Produto inválido")
            } else {
                listaDeCompras.add(produto)
                println("Produto adicionado com sucesso!")
            }
        }

        fun remover(produto: String) {
            if (produto.isEmpty()) {
                println("Produto inválido")
            } else if (listaDeCompras.contains(produto)) {
                listaDeCompras.remove(produto)
                println("Produto removido com sucesso")
            } else {
                println("Esse produto não existe na lista")
            }
        }

    }
}



