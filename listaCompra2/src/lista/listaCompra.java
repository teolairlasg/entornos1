package lista;

import java.util.ArrayList;

public class listaCompra {
	ArrayList<String> lista;

	public listaCompra() {
		this.lista = new ArrayList<String>();
	}
	
	public void apuntar(String articulo) {
		if(this.lista.contains(articulo)) {
			System.out.println("El articulo ya está en la lista.");
		}else {
			this.lista.add(articulo);
		}
	}
	public void borrar(String articulo) {
		if(this.lista.contains(articulo)) {
			System.out.println("El artículo no existe en la lista.");
		}else {
			this.lista.remove(articulo);
		}
	}
	public int numArticulos() {
		return this.lista.size();
	}
}
