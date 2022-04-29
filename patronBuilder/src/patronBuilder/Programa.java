package patronBuilder;

import java.util.ArrayList;
import java.util.TreeSet;

public class Programa {

	public static void main(String[] args) {
		TreeSet<String> intereses = new TreeSet<String>();
		intereses.add("motor");
		intereses.add( "tecnología");
		intereses.add( "Informática");
		Usuario usu = new UsuarioBuilder()
				.email("hola@esviernes.com")
				.nombre("Juan", "González")
				.direccion("Calle Perena, 25")
				.interes("Informática")
				.intereses(intereses)
				.nombre("Jorge", "López")
				.build();
		System.out.println(usu);

	}

}
