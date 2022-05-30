package ejemploSingleton;

public class Programa {
	public static void main(String[] args) {
		Director dire = Director.getInstance("Joaquín");
		Director dire2 = Director.getInstance("Manolo");
		Director dire3 = Director.getInstance();
		System.out.println(dire);
		System.out.println(dire2);
		System.out.println(dire3);
		System.out.println(dire2.equals(dire));
		System.out.println(dire3.equals(dire));
		System.out.println(dire2.equals(dire3));
	}

}
