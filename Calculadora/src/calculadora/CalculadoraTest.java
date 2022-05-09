package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	
	@Test
	void testCalculadora() {
		fail("Not yet implemented");
	}

	@Test
	void testSuma() {
		Calculadora c = new Calculadora(4,5);
		int resultado = c.suma();
		assertEquals(9, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testResta() {
		Calculadora c = new Calculadora(4,5);
		int resultado = c.resta();
		assertEquals(-1, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testProducto() {
		Calculadora c = new Calculadora(4,5);
		int resultado = c.producto();
		assertEquals(20, resultado);
		//fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		Calculadora c = new Calculadora(4,5);
		double resultado = c.division();
		assertEquals(0.8, resultado);
		//fail("Not yet implemented");
	}
	
	@Test
	void testImprimirSuma() {
		
		
	}

}
