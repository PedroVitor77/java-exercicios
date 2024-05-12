import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testAdicao() {
        Calculadora calc = new Calculadora();
        double resultado = calc.somar(3, 2);
        assertEquals(5, resultado, 0);
    }

    @Test
    public void testDivisaoPorZero() {
        Calculadora calc = new Calculadora();
        try {
            calc.dividir(5, 0);
            fail("Deveria ter lançado uma exceção de divisão por zero");
        } catch (IllegalArgumentException e) {
            // Esperado
        }
    }
}
