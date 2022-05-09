package proyectoFuncionesLambda;

import java.util.ArrayList;
import java.util.Comparator;

public class ProgramaPersonas {

	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona("Juan", 34));
		lista.add(new Persona("Mariana", 36));
		lista.add(new Persona("Juan", 30));
		lista.add(new Persona("María", 24));
		lista.add(new Persona("Jaime", 54));
		
		lista.forEach( p -> System.out.println(p) );
		System.out.println("------");
		
		Comparator<Persona> funcionComparadora = (p1,  p2) -> {
			if (p1.getNombre().compareTo(p2.getNombre()) == 0)
				return p1.getEdad() - p2.getEdad();
			else 
				return p1.getNombre().compareTo(p2.getNombre());
		};
		lista.forEach( p -> System.out.println(p) );
		lista.add(new Persona("Joaquín",34));
		lista.sort(funcionComparadora);
		lista.forEach( p -> System.out.println(p) );
		lista.add(new Persona("Joaquina",24));
		lista.sort(funcionComparadora);
		lista.forEach( p -> System.out.println(p) );
	}

}

