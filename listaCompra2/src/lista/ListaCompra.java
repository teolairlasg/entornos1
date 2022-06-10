package lista;

import java.util.ArrayList;

public class ListaCompra {
	ArrayList<String> lista;

	public ListaCompra() {
		this.lista = new ArrayList<String>();
	}
	
	public void apuntar(String articulo) {
		if(this.lista.contains(articulo)) {
			System.out.println("El articulo ya est� en la lista.");
		}else {
			this.lista.add(articulo);
		}
	}
	public void borrar(String articulo) {
		if(this.lista.contains(articulo)) {
			this.lista.remove(articulo);
		}else {
			System.out.println("El art�culo no existe en la lista.");			
		}
	}
	public int numArticulos() {
		return this.lista.size();
	}
}
