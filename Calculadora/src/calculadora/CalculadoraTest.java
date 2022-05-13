package calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Ejemplo JUnit5 Calculadora")
class CalculadoraTest {
	
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeAll
	public static void inicio() {
		System.out.println("Método init!!");
	}
	
	@AfterAll
	public static void alFinal() {
		System.out.println("Después de todos");
	}
	
	//método para lanzar antes de cada uno de los
	//tests.
	@BeforeEach
	public void initEach() {
		System.out.println("Método init cada vez!!");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Método al final de cada test!");
	}
	
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
		// el tercer parámetro es un mensaje personalizado
		// en caso de error.
		assertEquals(-1, resultado,"Debería ser -1");
		//fail("Not yet implemented");
	}
	@Test
	void testRestaPositivo() {
		Calculadora c = new Calculadora(9,5);
		int resultado = c.resta();
		// el tercer parámetro es un mensaje personalizado
		// en caso de error.
		assertEquals(4, resultado,"Debería ser 4");
		//fail("Not yet implemented");
	}
	

	@RepeatedTest(10)
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
		System.setOut(new PrintStream(outputStreamCaptor));
		Calculadora c = new Calculadora(3,4);
		c.imprimirSuma();
		assertEquals("7\r\n",outputStreamCaptor.toString());	
	}
	
	@ParameterizedTest
	@ValueSource(ints = { 2,3,4,5,6 })
	void comprobarSignoRaiz(int candidato) {
		Calculadora c = new Calculadora(candidato, 1);
		assertTrue(c.raizNum1() > 0);
	}
	
	@ParameterizedTest(name = "Suma {index}: ({0})+({1})={2}")
	@CsvSource({ "1,1,2", "2,-1,1","2,3,5" })
	void comprobarSumas(int num1, int num2, int resultado) {
		Calculadora c = new Calculadora(num1,num2);
		assertEquals(resultado, c.suma());
	}
	@ParameterizedTest
	@CsvSource({ "1,1,1", "2,-1,-2","5,2,2.5" })
	void comprobarDivisiones(int num1, int num2, double resultado) {
		Calculadora c = new Calculadora(num1,num2);
		assertEquals(resultado, c.division());
	}
	
	
	
	
	

}
