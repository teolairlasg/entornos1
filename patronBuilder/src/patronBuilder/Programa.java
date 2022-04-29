package patronBuilder;

public class Programa {

	public static void main(String[] args) {
		Usuario usu = new UsuarioBuilder()
				.email("hola@esviernes.com")
				.nombre("Juan", "Gonz�lez")
				.direccion("Calle Perena, 25")
				.build();
		System.out.println(usu);

	}

}
