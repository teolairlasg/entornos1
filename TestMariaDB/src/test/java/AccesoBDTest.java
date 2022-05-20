import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.AccesoBD;

class AccesoBDTest {

	@Test
	void testConexionBuena() {
		AccesoBD abd = new AccesoBD(
				"src/test/resources/bdProperties.properties");
		abd.conectar();
		assertTrue(abd.testConexion());
		abd.desconectar();
	}
	@Test
	void testConexionMala() {
		AccesoBD abd = new AccesoBD(
				"src/test/resources/bdPropertiesMalo.properties");
		//TODO: gesti�n de excepciones
		abd.conectar();
		
		abd.desconectar();
	}
}
