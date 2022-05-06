package proyectoFuncionesLambda;

import java.util.Arrays;
import java.util.Collections;
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
		lista.add("Jos�");
		
		HashMap<String, String> mapa = new HashMap<String, String>();
		mapa.put("Espa�a", "Madrid");
		mapa.put("Francia", "Par�s");
		mapa.put("M�xico", "M�xico D. C.");
		
		for (String s: lista) {
			System.out.println(s);
		}
		// cuando es s�lo un par�metro no hacen falta par�ntesis
		lista.forEach( elemento -> System.out.println(elemento) );
		
		if (mapa.get("Polonia") == null) {
			mapa.put("Polonia", "Varsovia");
		}
		
		mapa.computeIfAbsent("Polonia", s -> "Varsovia" );

		HashMap<String, Integer> contador = new HashMap<String, Integer>();
		
		String texto = "hola hola qu� tal";
		List<String> palabras = Arrays.asList(texto.split(" "));
		palabras.forEach(palabra  -> {
			contador.computeIfPresent(palabra,	(k, v) -> v+1);
			contador.computeIfAbsent(palabra, 	k -> 1);
		});
		
		Collections.sort(lista);
		
		System.out.println(contador);
		
		// cuando son dos s� hacen falta par�ntesis.
		mapa.forEach( ( pais, capital  ) -> {
						System.out.println("La capital de "+pais+" es "+capital);
						System.out.println(".");
						});
		
		
		
		
		
		
		
		
	}

}
