package listacompratest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import listacompra.Articulo;

class ArticuloTest {

	@Test
	void testArticulo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetPrecio() {
		Articulo art = new Articulo(12.23, "Manzanas", "Descripcion");
		assertEquals(12.23, art.getPrecio());
	}
	@Test
	void testGetPrecioNegativo() {
		Articulo art = new Articulo(-12.23, "Manzanas", "Descripcion");
		assertEquals(10.0, art.getPrecio(),"Se esperaba 10");
	}

	@Test
	void testSetPrecioNegativo() {
		Exception e = assertThrows(
							Exception.class,
							()->{
								Articulo art = new Articulo(12,"Manzanas", "Descripcion");
								art.setPrecio(-2.5);
							},
							"Se esperaba una excepción"
						);
		assertEquals("No se puede poner un precio negativo", e.getMessage());
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDescripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDescripcion() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
