import CRetorno.Calculadora
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    
    @Test
    fun somaTest() {
        assertEquals(3.0, Calculadora.soma(2.0,1.0))
    }

    @Test
    fun subtraçãoTest() {
        assertEquals(1.0, Calculadora.subtração(2.0,1.0))
    }

    @Test
    fun multiplTest() {
        assertEquals(2.0, Calculadora.multipl(2.0,1.0))
    }

    @Test
    fun divisãoTest() {
        assertEquals(1.0, Calculadora.divisão(2.0,1.0))
    }

}
