package programa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class AccesoBD {
	
	Connection conexion;
	String ficheroProperties;
	
	public AccesoBD(String ficheroProperties) {
		super();
		this.ficheroProperties = ficheroProperties;
	}
	public void conectar() {
		
		Properties bdProp = new Properties();
		InputStream fichero = null;
		try {
			fichero = new FileInputStream(ficheroProperties);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			bdProp.load( fichero );
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		try {
			//System.out.println(bdProp.getProperty("user"));
			conexion = DriverManager.getConnection(
					"jdbc:mariadb://bd.iesguara.cf:3306/DAM1Test_Personas"
					,bdProp);
			System.out.println(conexion.getMetaData().getDatabaseMajorVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void desconectar() throws SQLException {
		System.out.print("Intentando la desconexión...");
		conexion.close();
		System.out.println("Desconectado!");
	}
	
	public int insertarPersona( String nombre, 
								String apellidos,
								int edad) 
			throws SQLException {
		PreparedStatement ps = conexion.prepareStatement(
				"INSERT INTO Persona VALUES (?,?,?)");
		ps.setString(1, nombre);
		ps.setString(2, apellidos);
		ps.setInt(3, edad);
		return ps.executeUpdate();
	}
}
