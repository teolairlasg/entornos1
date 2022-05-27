package listacompra;

public class Programa {

	public static void main(String[] args) {
		Lista lista = new Lista("Prueba");
		lista.anyadirArticulo(new Articulo(2.4, "Manzanas", "Manzanas Golden"));
		lista.anyadirArticulo(new Articulo(2.3, "Tomates", "Tomates Raff"));
		lista.anyadirArticulo(new Articulo(2.6, "Naranjas", "Naranjas de zumo"));
		lista.anyadirArticulo(new Articulo(14, "Mango", "Mango verde"));
		lista.anyadirArticulo(new Articulo(1.4, "Limón", "Limón Siciliano"));
		System.out.println(lista);
		lista.borrarUltimo();
		System.out.println(lista);
	}
}
