package patronBuilderClaseInterna;

import java.util.TreeSet;

public class Usuario {

	private String email;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	private TreeSet<String> intereses;
	
	public static class Builder {

		private String email;
		private String nombre;
		private String apellidos;
		private String telefono;
		private String direccion;
		private TreeSet<String> intereses;

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder nombre(String nombre, String apellidos) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			return this;
		}

		public Builder telefono(String telefono) {
			this.telefono = telefono;
			return this;
		}

		public Builder direccion(String direccion) {
			this.direccion = direccion;
			return this;
		}

		public Builder intereses(TreeSet<String> intereses) {
			if (this.intereses == null) {
				this.intereses = intereses;
			} else {
				this.intereses.addAll(intereses);
			}
			return this;
		}

		public Builder interes(String interes) {
			if (this.intereses == null) {
				this.intereses = new TreeSet<String>();
			}
			intereses.add(interes);
			return this;
		}

		public Usuario build() {
			return new Usuario(this);
		}
	}

	Usuario(Builder builder) {
		if (builder.email == null) {
			throw new IllegalArgumentException("email es requerido");
		}
		this.email = builder.email;
		this.nombre = builder.nombre;
		this.apellidos = builder.apellidos;
		this.telefono = builder.telefono;
		this.direccion = builder.direccion;
		this.intereses = builder.intereses;
	}
	
	@Override
	public String toString() {
		return "Usuario [email=" + email + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", intereses=" + intereses + "]";
	}

}
