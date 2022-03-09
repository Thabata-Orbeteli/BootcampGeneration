package CRetorno

class Calculadora {

    companion object {
        fun soma(x: Double, y: Double): Double {
            return (x + y)
        }

        fun subtração(x: Double, y: Double): Double {
            return (x - y)
        }

        fun multipl(x: Double, y: Double): Double {
            return (x * y)
        }

        fun divisão(x: Double, y: Double): Double {
            return (x / y)
        }

        fun menu() {
            print("Digite o primeiro número: ")
            val n1 = readLine()!!.toDouble()
            print("Digite o primeiro número: ")
            val n2 = readLine()!!.toDouble()
            println("Qual operação vc deseja realizar? \n 1-Soma \n 2-Subtração \n 3-Multiplicação \n 4-Divisão ")
            val oper = readLine()!!.toInt()

            when (oper) {
                1 -> println("A soma é ${soma(n1, n2)}.")
                2 -> println("A subtração é ${subtração(n1, n2)}.")
                3 -> println("A multiplicação é ${multipl(n1, n2)}.")
                4 -> println("A divisão é ${divisão(n1, n2)}.")
            }
        }
    }
}