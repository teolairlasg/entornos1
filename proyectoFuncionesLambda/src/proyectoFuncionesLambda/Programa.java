package proyectoFuncionesLambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		System.out.println(lista.getClass());
		lista.add("Juan");
		lista.add("Javier");
		lista.add("Manuela");
		lista.add("Mariano");
		lista.add("José");
		
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("España", "Madrid");
		mapa.put("Francia", "París");
		mapa.put("México", "México D. C.");
		
		for (String s: lista) {
			System.out.println(s);
		}
		// cuando es sólo un parámetro no hacen falta paréntesis
		lista.forEach( elemento -> System.out.println(elemento) );
		
		mapa.put("Polonia", "Varsovia");
		mapa.put("Polonia", "Varsovia");
		
		System.out.println(mapa.computeIfAbsent("Polonia", s -> "Varsovia" ));

		HashMap<String, Integer> contador = new HashMap<String, Integer>();
		
		List<String> palabras = Arrays.asList("hola qué tal".split(" "));
		palabras.forEach(palabra  -> {
			contador.putIfAbsent(palabra, 0 );
			contador.computeIfPresent(palabra, (p, i) -> i+1 );
		});
		
		System.out.println(contador);
		
		// cuando son dos sí hacen falta paréntesis.
		mapa.forEach( ( pais, capital  ) -> {
						System.out.println("La capital de "+pais+" es "+capital);
						System.out.println(".");
						});
		
		
		
		
		
		
		
		
	}

}
