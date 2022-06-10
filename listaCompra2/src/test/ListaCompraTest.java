package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lista.ListaCompra;

class ListaCompraTest {

	@Test
	void testListaCompra() {
		ListaCompra l = new ListaCompra();
		assertEquals(0, l.numArticulos());
	}

	@Test
	void testApuntar() {
		ListaCompra l = new ListaCompra();
		l.apuntar("Patatas");
		assertEquals(1, l.numArticulos());
	}
	
	@Test
	void testApuntarRepetido() {
		ListaCompra l = new ListaCompra();
		l.apuntar("Patatas");
		l.apuntar("Naranjas");
		int numElem = l.numArticulos();
		l.apuntar("Patatas");
		assertEquals(numElem, l.numArticulos());
	}
	

	@Test
	void testBorrar() {
		ListaCompra l = new ListaCompra();
		l.apuntar("Limones");
		l.apuntar("Naranjas");
		l.apuntar("Patatas");
		int numElem = l.numArticulos();
		l.borrar("Naranjas");
		assertEquals(numElem-1, l.numArticulos());
	}
	
	@Test
	void testBorrarNoExistente() {
		ListaCompra l = new ListaCompra();
		l.apuntar("Limones");
		l.apuntar("Naranjas");
		l.apuntar("Patatas");
		int numElem = l.numArticulos();
		l.borrar("Fresas");
		assertEquals(numElem, l.numArticulos());
	}
	

	@Test
	void testNumArticulos() {
		ListaCompra l = new ListaCompra();
		assertEquals(0, l.numArticulos());
		l.apuntar("Patatas");
		assertEquals(1, l.numArticulos());
	}

}
