package patronBuilderClaseInterna;

import java.util.ArrayList;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		TreeSet<String> intereses = new TreeSet<String>();
		intereses.add("motor");
		intereses.add( "tecnolog�a");
		intereses.add( "Inform�tica");
		Usuario usu = new Usuario.Builder()
				.email("hola@esviernes.com")
				.nombre("Juan", "Gonz�lez")
				.direccion("Calle Perena, 25")
				.interes("Inform�tica")
				.intereses(intereses)
				.nombre("Jorge", "L�pez")
				.build();
		System.out.println(usu);

	}

}
