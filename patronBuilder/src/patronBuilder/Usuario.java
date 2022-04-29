package patronBuilder;

import java.util.TreeSet;

public class Usuario {

    private String email;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private TreeSet<String> intereses;
  
    // esto es para que no se cree el constructor por defecto
    private Usuario() {
    }
  
    Usuario(UsuarioBuilder builder) {
        if (builder.getEmail() == null) {
            throw new IllegalArgumentException("email es requerido");
        }
        this.email = builder.getEmail();
        this.nombre = builder.getNombre();
        this.apellidos = builder.getApellidos();
        this.telefono = builder.getTelefono();
        this.direccion = builder.getDireccion();
        this.intereses = builder.getIntereses();   
    }

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", intereses=" + intereses + "]";
	}


}
