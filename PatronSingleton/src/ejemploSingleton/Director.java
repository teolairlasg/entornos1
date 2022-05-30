package ejemploSingleton;

public final class Director {
	private static Director instancia;
	public String nombre;
	
	private Director(String nombre) {
		this.nombre = nombre;
	}
	
	public static Director getInstance(String nombre) {
		if(instancia == null) {
			instancia = new Director(nombre);
		}
		return instancia;	
	}
	public static Director getInstance() {
		if(instancia == null) {
			instancia = new Director("director por defecto");
		}
		return instancia;	
	}

	@Override
	public String toString() {
		return "Director [nombre=" + nombre + "]";
	}
	

}
