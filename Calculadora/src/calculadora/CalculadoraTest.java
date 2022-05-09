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
		fail("Not yet implemented");
	}

	@Test
	void testProducto() {
		fail("Not yet implemented");
	}

	@Test
	void testDivision() {
		fail("Not yet implemented");
	}

}
