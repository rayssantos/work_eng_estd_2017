package estd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void somarTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(3, 5);
		Assert.assertEquals(8, resultado);
	}

	@Test
	public void subtrairTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(6, 2);
		Assert.assertEquals(4, resultado);
	}

	@Test
	public void multiplicarTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicar(3, 5);
		Assert.assertEquals(15, resultado);
	}

	@Test
	public void dividirTest() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.dividir(6, 3);
		Assert.assertEquals(2, resultado);
	}

}
