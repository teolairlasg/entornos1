package listacompra;

import java.util.ArrayList;

public class Lista {
	String nombre;
	ArrayList<Articulo> lista;

	public Lista(String nombre) {
		lista = new ArrayList<Articulo>();
		this.nombre = nombre;
	}
	
	public void anyadirArticulo(Articulo art) {
		lista.add(art);
	}
	
	public void borrarArtiuclo(Articulo art) {
		lista.remove(art);
	}
	
	public void borrarUltimo() {
		lista.remove(lista.size()-1);
	}

	@Override
	public String toString() {
		return "Lista [nombre=" + nombre + 
				", lista=" + lista + "]";
	}
}
